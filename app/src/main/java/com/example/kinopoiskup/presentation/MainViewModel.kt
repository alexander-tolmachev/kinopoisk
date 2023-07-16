package com.example.kinopoiskup.presentation

import android.util.Log
import androidx.lifecycle.*
import androidx.paging.*
import com.example.kinopoiskup.data.*
import com.example.kinopoiskup.entity.*
import com.example.kinopoiskup.data.MainPagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.system.measureNanoTime


@HiltViewModel
class MainViewModel @Inject constructor(
    private val dataStore: DataStoreManager,
    private val dao: CollectionDao,
    private val repository: MainRepository
) : ViewModel() {

    private val _error = Channel<String>()
    val error = _error.receiveAsFlow()
    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()
    private val _ready = Channel<Boolean>()
    val ready = _ready.receiveAsFlow()

    var table: MutableList<Int?> = mutableListOf() // cleared

    var yearFirst: String? = null //+
    var yearLast: String? = null //+
    var rangeFrom: Int? = null //+
    var rangeTo: Int? = null //+
    var countrySelected: Int? = null //+
    var genreSelected: Int? = null //+
    var countrySelectedString: String? = null //+
    var genreSelectedString: String? = null //+
    var sortOrder = arrayOf("RATING", "YEAR", "NUM_VOTE")
    var filmType = arrayOf("ALL", "FILM", "TV_SERIES")
    var orderSelector: Int? = null //+
    var typeSelector: Int? = null //+
    var hideSeenFilms = false //+

    var picMap = mutableMapOf<String, Int>()
    private val picQueries = listOf(
        "STILL", "SHOOTING", "POSTER",
        "FAN_ART", "PROMO", "CONCEPT", "WALLPAPER",
        "COVER", "SCREENSHOT"
    )
    var picResults = mutableListOf<List<ImageItems>>() // cleared
    var picCount = 0

    var isNetworkErrorShow = true
    var isForward = true
    var isStaffForward = true

    var movieId = -1
    var moviePosition = -1

    var actorId = -1 //
    var actorFilms = 0

    var showSerial: List<SeasonItems> = emptyList()
    var staffFilmsList: MutableList<StaffFilms> = mutableListOf<StaffFilms>() // cleared
    var similarFilmsList: MutableList<MoviesFilms> = mutableListOf<MoviesFilms>() // cleared

    var showGalleryStaff: MutableLiveData<List<RecyclerItem>> =
        MutableLiveData<List<RecyclerItem>>()
    var showGallery: MutableLiveData<List<RecyclerItem>> = MutableLiveData<List<RecyclerItem>>()
    var showGalleryFull: MutableLiveData<List<RecyclerItem>> =
        MutableLiveData<List<RecyclerItem>>()

    private var listRecyclerStaff = mutableListOf<RecyclerItem>() // cleared
    private var listRecycler = mutableListOf<RecyclerItem>() // cleared
    var listRecyclerFull = mutableListOf<RecyclerItem>() // cleared

    var showProfile: MutableLiveData<List<RecyclerItem>> = MutableLiveData<List<RecyclerItem>>()
    private var profileRecycler = mutableListOf<RecyclerItem>() // cleared
    var filmInfo = FilmInfoDTO()
    var showFilmInfo: MutableLiveData<FilmInfoDTO> = MutableLiveData<FilmInfoDTO>()

    private var staffInfo = StaffDTO()
    var staffInfoFilms = mutableListOf<MoviesFilms>()  // cleared
    var staffInfoFilmsLocal = mutableListOf<MoviesFilms>()
    var staffInfoShow: MutableLiveData<StaffDTO> = MutableLiveData<StaffDTO>()

    var showSearchResults: MutableLiveData<List<MoviesFilms>> = MutableLiveData<List<MoviesFilms>>()
    private var listSearch = listOf<MoviesFilms>()
    var listPremieres = mutableListOf<MoviesFilms>() // cleared

    var genres = listOf<Genres>()
    var countries = listOf<Countries>()

    private var delayJob: Job? = null
    private var activeJob: Job? = null

    val years: List<String> = (1955..2023).map { it.toString() }

    private val userPreferencesFlow = dataStore.readUserPreferences
    val preferences = userPreferencesFlow.asLiveData()

    fun saveShowCompleted(show: Boolean) {
        viewModelScope.launch {
            dataStore.updateShowCompleted(show)
        }
    }

    fun saveIntPreference(value: Int, mode: Int) {
        viewModelScope.launch {
            dataStore.updateIntPreference(value, mode)
        }
    }

    fun saveStringPreference(value: String, mode: Int) {
        viewModelScope.launch {
            dataStore.updateStringPreference(value, mode)
        }
    }

    fun readUserPreferences() {
        viewModelScope.launch {
            dataStore.readUserPreferences
        }
    }

    fun pagedNetworkFlow(request: QueryItem): Flow<PagingData<MoviesFilms>> = Pager(
        config = PagingConfig(pageSize = 20),
        pagingSourceFactory = { PagingNetworkDataSource(repository = repository, request) }
    ).flow.cachedIn(viewModelScope)

    fun pagedNetworkFlowGallery(request: QueryItem): Flow<PagingData<ImageItems>> = Pager(
        config = PagingConfig(pageSize = 20),
        pagingSourceFactory = { PagingNetworkDataSourceGallery(repository = repository, request) }
    ).flow.cachedIn(viewModelScope)

    fun pagedStaffFlow(query: Int): Flow<PagingData<StaffEntity>> = Pager(
        config = PagingConfig(pageSize = 15, enablePlaceholders = false, initialLoadSize = 15),
        pagingSourceFactory = { PagingDatabaseSource(repository = repository, query) }
    ).flow.cachedIn(viewModelScope)

    fun pagedCollectionFlow(): Flow<PagingData<CollectionEntity>> = Pager(
        config = PagingConfig(pageSize = 5, enablePlaceholders = false, initialLoadSize = 5),
        pagingSourceFactory = { MainPagingSource(dao) }
    ).flow.cachedIn(viewModelScope)

    fun addMovieDatabase(film: FilmEntity) {
        viewModelScope.launch {
            repository.addMoview(film)
        }
    }

    fun updateFilmBitmask(id: Int, bitmask: Long) {
        viewModelScope.launch {
            repository.updateMoview(id, bitmask)
            listRecycler.forEach {
                refreshListSynch(it.list!!)
            }
            showGallery.value = listRecycler
            showFilmInfo.value = filmInfo
        }
    }

    fun deleteFilmsByCategory() {
        viewModelScope.launch {
            repository.deleteFilms()
        }
    }

    fun loadProfileData() {
        viewModelScope.launch {
            val item1 = RecyclerItem()
            val item2 = RecyclerItem()
            val item3 = RecyclerItem()

            profileRecycler = emptyList<RecyclerItem>().toMutableList() //TODO

            val dateFormatYear = SimpleDateFormat("yyyy", Locale.getDefault())
            val dateFormatMonth = SimpleDateFormat("LLLL", Locale.US)
            val myDate = Date()
            val calendar: Calendar = Calendar.getInstance()
            calendar.time = myDate
            calendar.add(Calendar.DAY_OF_YEAR, -14)
            val newDate: Date = calendar.time
            val year: Int = dateFormatYear.format(newDate).toInt()
            var month: String = dateFormatMonth.format(newDate)
            month = month.uppercase()

            item1.title = "Просмотрено"
            var target: Long = 1L
            target = target shl 62 //item.idx!! cat просмотренные
            item1.list = repository.getFilms(target, false)
            item1.type = 4
            profileRecycler.add(item1)

            item2.title = "Коллекции"
            item2.collections = repository.getCollections()
            item2.type = 6
            profileRecycler.add(item2)

            item3.title = "Вам было интересно"
            item3.list = repository.getFilms(0, true)
            item3.type = 5
            profileRecycler.add(item3)

            showProfile.value = profileRecycler
        }
    }

    fun loadProfileCollection(collection: Int) {
        viewModelScope.launch {
            var target: Long = 1L
            target = target shl collection
            listSearch = emptyList()
            listSearch = repository.getFilms(target, false)

            showSearchResults.value = listSearch
        }
    }

    fun addCollection(value: CollectionEntity) {
        viewModelScope.launch {
            repository.addCollection(value)
        }
    }

    fun setupCollection() {
        viewModelScope.launch {
            table = emptyList<Int?>().toMutableList()
            table = repository.readIndexes().toMutableList()

            var cnt = 0
            var position = -1
            table.forEach {
                if (it != null) {
                    val count = repository.getCollectionCount(it)
                }
                if (it == null && position == -1) position = cnt - 1
                else cnt = it!!
            }
            if (position == -1) position = cnt - 1

            if (table.size == 0) {
                val collection = CollectionEntity()
                table.add(61)
                collection.name = "Любимые"
                collection.idx = 61
                repository.addCollection(collection)
                table.add(60)
                collection.name = "Хочу посмотреть"
                collection.idx = 60
                repository.addCollection(collection)
            }
        }
    }

    fun deleteCollection(index: Int) {
        viewModelScope.launch {
            var bitset: Long = 1L
            bitset = bitset shl index
            val target = bitset.inv()
            if (index < 60) repository.deleteCollection(index)
            repository.cleanFilmsCategory(bitset, target)
            if (index < 60) {
                profileRecycler[1].collections = repository.getCollections()
                showProfile.value = profileRecycler
            }
        }
    }

    fun addNewCollection(item: CollectionEntity) {
        viewModelScope.launch {
            repository.addCollection(item)
            profileRecycler[1].collections = repository.getCollections()
            showProfile.value = profileRecycler
        }
    }

    fun updateCollection(name: String, value: Int) {
        viewModelScope.launch {
            repository.updateCollection(name, value)
        }
    }

    fun updateCollectionCount(name: String, value: Int) {
        viewModelScope.launch {
            repository.updateCollectionCount(name, value)
        }
    }

    fun tryToRefreshItemsList(first: Int, last: Int, tab: Int) {
        viewModelScope.launch() {
            if (activeJob == null) {
                refreshItemsList(first, last, tab)
            } else if (activeJob?.isActive == true)
                activeJob?.cancel()
            delay(500)
            activeJob = null
            refreshItemsList(first, last, tab)
        }

    }

    fun cancelDelay() {
        delayJob?.cancel()
        delayJob = null
    }

    fun runDelay() {
        delayJob = viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            _ready.send(true)
        }
    }

    suspend fun refreshListSynch(list: List<MoviesFilms>) {
        list.forEach {
            var index: Int? = it.kinopoiskId
            if (index == null) index = it.filmId
            if (index != null) it.bitmask = repository.getFilmBitmask(index)
        }
    }

    suspend fun loadGenres() {
        val result = repository.getGenres()
        var idx = 1
        result.genres.forEach { it.index = idx++ }
        idx = 1
        result.countries.forEach { it.index = idx++ }
        genres = result.genres.filter { it.genre!!.length > 1 }
        countries = result.countries.filter { it.country!!.length > 1 }
    }

    fun String.firstCap() = this.replaceFirstChar { it.uppercase() }

    suspend fun loadKinopoisk() {
        val item = RecyclerItem()
        val item1 = RecyclerItem()
        val item2 = RecyclerItem()
        val item3 = RecyclerItem()
        val item4 = RecyclerItem()
        val item5 = RecyclerItem()
        var str = "Все"

        listRecycler = emptyList<RecyclerItem>().toMutableList()

        val dateFormatYear = SimpleDateFormat("yyyy", Locale.getDefault())
        val dateFormatMonth = SimpleDateFormat("LLLL", Locale.US)
        val myDate = Date()
        val calendar: Calendar = Calendar.getInstance()
        calendar.time = myDate
        calendar.add(Calendar.DAY_OF_YEAR, -14)
        val newDate: Date = calendar.time
        val year: Int = dateFormatYear.format(newDate).toInt()
        var month: String = dateFormatMonth.format(newDate)
        month = month.uppercase()

        item.title = "Премьеры"
        item.list = repository.getPremieres(year, month)
        refreshListSynch(item.list!!)
        listPremieres = emptyList<MoviesFilms>().toMutableList()
        item.list!!.forEach {
            listPremieres.add(it)
        }
        if (item.list!!.isEmpty()) str = "Не найдено"
        else if (item.list!!.size < 20) str = ""
        item.mark = str
        item.line = 5
        listRecycler.add(item)

        item1.title = "Популярное"
        item1.list = repository.getTopPopular(1)
        refreshListSynch(item1.list!!)
        str = "Все"
        if (item1.list!!.isEmpty()) str = "Не найдено"
        else if (item1.list!!.size < 20) str = ""
        item1.mark = str
        item1.line = 1
        listRecycler.add(item1)

        val rand = Random()
        var randonIndexCountries = rand.nextInt(countries.size)
        var randonIndexGenres = rand.nextInt(genres.size)
        var countryIdx = countries[randonIndexCountries].index
        var genreIdx = genres[randonIndexGenres].index
        var country = countries[randonIndexCountries].country
        var genre = genres[randonIndexGenres].genre
        genre = genre!!.firstCap()

        item2.list = repository.getRandom(countryIdx, genreIdx, 1)
        refreshListSynch(item2.list!!)
        item2.title = "$genre $country"
        if (item2.list!!.isEmpty()) {
            item2.title = "$genre $country"
        }
        if (item2.list!!.isEmpty()) str = "Не найдено"
        else if (item2.list!!.size < 20) str = ""
        item2.mark = str
        item2.param1 = countryIdx
        item2.param2 = genreIdx
        item2.line = 4
        listRecycler.add(item2)

        randonIndexCountries = rand.nextInt(countries.size)
        randonIndexGenres = rand.nextInt(genres.size)
        countryIdx = countries[randonIndexCountries].index
        genreIdx = genres[randonIndexGenres].index
        country = countries[randonIndexCountries].country
        genre = genres[randonIndexGenres].genre
        genre = genre!!.firstCap()

        item3.list = repository.getRandom(countryIdx, genreIdx, 1)
        refreshListSynch(item3.list!!)
        item3.title = "$genre $country"
        if (item3.list!!.isEmpty()) {
            item3.title = "$genre $country"
        }
        str = "Все"
        if (item3.list!!.isEmpty()) str = "Не найдено"
        else if (item3.list!!.size < 20) str = ""
        item3.mark = str
        item3.param1 = countryIdx
        item3.param2 = genreIdx
        item3.line = 4
        listRecycler.add(item3)

        item4.title = "Тор-250"
        item4.list = repository.getTop250(1)
        refreshListSynch(item4.list!!)
        str = "Все"
        if (item4.list!!.isEmpty()) str = "Не найдено"
        else if (item4.list!!.size < 20) str = ""
        item4.mark = str
        item4.line = 2
        listRecycler.add(item4)

        item5.title = "Сериалы"
        item5.list = repository.getSerials(1)
        refreshListSynch(item5.list!!)
        str = "Все"
        if (item5.list!!.isEmpty()) str = "Не найдено"
        else if (item5.list!!.size < 20) str = ""
        item5.mark = str
        item5.line = 3
        listRecycler.add(item5)
        showGallery.value = listRecycler
    }

    fun loadFilmById() {
        viewModelScope.launch() {
            try {
                filmInfo = repository.getFilmDetails(movieId)
                filmInfo.bitmask = repository.getFilmBitmask(movieId)

                var serial = false
                filmInfo.serial?.let { serial = it }
                loadKinopoiskDetails(movieId, serial)
                showFilmInfo.value = filmInfo
            } catch (e: Exception) {
                val errorMessage = e.localizedMessage
                if (errorMessage != null) {
                    _error.send(errorMessage)
                }
            }
        }
    }

    fun loadStaffInfoById() {
        viewModelScope.launch {
            try {
                _isLoading.value = true
                listRecyclerStaff = emptyList<RecyclerItem>().toMutableList()
                val item = RecyclerItem()
                val bestFilms = mutableListOf<MoviesFilms>()
                staffInfoFilms = emptyList<MoviesFilms>().toMutableList()
                staffInfo = repository.getStaffById(actorId)
                staffFilmsList = emptyList<StaffFilms>().toMutableList()
                staffFilmsList = staffInfo.films.distinctBy { it.filmId }.toMutableList()
                staffFilmsList.sortByDescending { it.rating?.toDouble() }

                val count = staffFilmsList.size
                actorFilms = count
                staffInfoShow.value = staffInfo

                for (i in 0 until count) {
                    val kino = MoviesFilms()
                    if (i < 5) {
                        val film = staffFilmsList[i].filmId?.let { repository.getFilmDetails(it) }
                        if (film != null) {
                            kino.genres = film.genres
                            kino.nameOriginal = film.nameOriginal
                            kino.posterUrlPreview = film.posterUrlPreview
                            kino.year = film.year
                        }
                    }
                    kino.filmId =
                        staffFilmsList[i].filmId
                    kino.nameEn = staffFilmsList[i].nameEn
                    kino.nameRu = staffFilmsList[i].nameRu
                    kino.profession = staffFilmsList[i].professionKey
                    kino.rating = staffFilmsList[i].rating
                    if (i < 5) bestFilms.add(kino)
                    staffInfoFilms.add(kino)
                }
                refreshListSynch(staffInfoFilms)

                var str = "Все"
                item.title = "Лучшее"
                item.list = bestFilms
                if (item.list!!.isEmpty()) str = "Не найдено"
                else if (item.list!!.size <= 20) str = ""
                item.mark = str
                item.line = 6  // TODO how?
                listRecyclerStaff.add(item)
                showGalleryStaff.value = listRecyclerStaff

            } catch (e: Exception) {
                val errorMessage = e.localizedMessage
                if (errorMessage != null) {
                    _error.send(errorMessage)
                }
            }
            _isLoading.value = false
        }
    }

    private val _film = MutableSharedFlow<Pair<Int, Int>>()
    val film = _film.asSharedFlow()

    fun refreshItemsList(first: Int, last: Int, tab: Int) {
        activeJob = viewModelScope.launch() {
            try {
                _isLoading.value = true
                refreshListSynch(staffInfoFilmsLocal)

                var idx = last
                var head = first
                if (last > staffInfoFilmsLocal.size - 1) {
                    idx = staffInfoFilmsLocal.size - 1
                }
                if (head > staffInfoFilmsLocal.size - 1) {
                    head = 0
                }
                for (i in head..idx) {
                    if (staffInfoFilmsLocal[i].posterUrlPreview == null) {
                        val film =
                            staffInfoFilmsLocal[i].filmId?.let { repository.getFilmDetails(it) }
                        if (film != null) {

                            staffInfoFilmsLocal[i].genres = film.genres
                            staffInfoFilmsLocal[i].nameOriginal = film.nameOriginal
                            staffInfoFilmsLocal[i].posterUrlPreview = film.posterUrlPreview
                            staffInfoFilmsLocal[i].year = film.year

                            _film.emit(
                                Pair(tab, i)
                            )
                        }
                    }
                }
            } catch (e: Exception) {
                val errorMessage = e.localizedMessage
                if (errorMessage != null) {
                    _error.send(errorMessage)
                }
            }
            _isLoading.value = false
        }
    }


    fun loadKinopoiskDetails(id: Int, serial: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {

            val item1 = RecyclerItem()
            val item2 = RecyclerItem()
            val item3 = RecyclerItem()
            val item4 = RecyclerItem()

            if (serial == true) {
                showSerial = repository.getFilmSeasones(id)
            }
            listRecyclerFull = emptyList<RecyclerItem>().toMutableList()
            val list: List<FilmStaffDTO> = repository.getFilmActors(id)

            item1.title = "В фильме участвовали"
            item1.stafflist =
                list.filter { it.professionKey!! == "ACTOR" }
            if (item1.stafflist!!.isNotEmpty()) {
                item1.type = 2
                listRecyclerFull.add(item1)
            }

            item2.title = "Над фильмом работали"
            item2.stafflist =
                list.filter { it.professionKey!! != "ACTOR" }
            if (item2.stafflist!!.isNotEmpty()) {
                item2.type = 3
                listRecyclerFull.add(item2)
            }


            item3.title = "Галерея"
            var result: ImagesDTO? = null
            picCount = 0
            picResults = emptyList<List<ImageItems>>().toMutableList()
            picMap.clear()
            picQueries.forEach {
                result = repository.getFilmImages(id, it, 1)
                if (result!!.items.isNotEmpty()) {
                    picMap[it] = result!!.total!!
                    picCount += result!!.total!!
                    picResults.add(result!!.items)
                }
            }
            if (picCount > 0) {
                val maxWith = picMap.maxWith { a, b -> a.value.compareTo(b.value) }
                var idx = 0
                var index = 0
                picMap.forEach {
                    if (it.key.equals(maxWith.key)) {
                        index = idx
                    }
                    idx++
                }
                item3.imagelist = picResults[index]
                item3.type = 0
                if (picCount > maxWith.value || maxWith.value > 20)
                    item3.param2 = picCount
                else item3.param2 = 0
                listRecyclerFull.add(item3)
            }

            item4.title = "Похожие фильмы"
            item4.similars = repository.getSimilarFilms(id)

            if (item4.similars!!.isNotEmpty()) {
                similarFilmsList = emptyList<MoviesFilms>().toMutableList()
                item4.similars!!.forEach {
                    val kino = MoviesFilms()
                    kino.filmId = it.filmId
                    kino.nameEn = it.nameEn
                    kino.nameOriginal = it.nameOriginal
                    kino.nameRu = it.nameRu
                    kino.posterUrlPreview = it.posterUrlPreview
                    kino.posterUrl = it.posterUrl
                    similarFilmsList.add(kino)
                }
                refreshListSynch(similarFilmsList)
                item4.line = 6
                item4.list = similarFilmsList
                item4.type = 1
                listRecyclerFull.add(item4)
            }
            showGalleryFull.postValue(listRecyclerFull)
        }
    }

    init {
        setupCollection()
        readUserPreferences()
        viewModelScope.launch {
            try {
                _isLoading.value = true
                loadGenres()
                loadKinopoisk()
            } catch (e: Exception) {
                val errorMessage = e.localizedMessage
                if (errorMessage != null) {
                    _error.send(errorMessage)
                }
            }
            _isLoading.value = false
        }
    }

}