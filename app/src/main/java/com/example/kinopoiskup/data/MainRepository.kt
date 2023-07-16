package com.example.kinopoiskup.data


import android.util.Log
import com.example.kinopoiskup.entity.*
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MainRepository @Inject constructor(
    private val retrofit: RetrofitService,
    private val collectionDao: CollectionDao,
    private val filmDao: FilmDao,
    private val staffDao: StaffDao
) {


    suspend fun addMoview(value: FilmEntity) {
        filmDao.insert(value)
    }

    suspend fun updateMoview(id: Int, bitmask: Long) {
        filmDao.updateFilmById(id, bitmask)
    }

    suspend fun getFilmBitmask(id: Int): Long {
        return filmDao.getFilmBitmask(id)
    }


    suspend fun deleteFilms() {
        filmDao.deleteFilms()
    }

    suspend fun cleanFilmsCategory(bitset: Long, target: Long) {
        filmDao.cleanFilmsCategory(bitset, target)
    }

    suspend fun getFilms(category: Long, getall: Boolean): List<MoviesFilms> {

        val list: List<FilmEntity>?
        if (!getall) list = filmDao.getFilmsByCategory(category)
        else list = filmDao.getFilmsAndActors()

        val result = emptyList<MoviesFilms>().toMutableList()
        list.forEach {
            val item = MoviesFilms()
            val genre = Genres()
            val genreList = mutableListOf<Genres>()

            item.kinopoiskId = it.kinopoiskId
            genre.genre = it.genre
            genreList.add(genre)
            item.genres = genreList
            item.nameRu = it.name
            item.posterUrlPreview = it.poster
            item.ratingKinopoisk = it.rating
            item.duration = it.category

            result.add(item)
        }

        return result
    }


    suspend fun addCollection(value: CollectionEntity) {
        collectionDao.add(value)
    }

    suspend fun deleteCollection(name: Int) {
        collectionDao.delete(name)
    }

    suspend fun getCollectionCount(name: Int): Int {
        return collectionDao.getCountByIdx(name)
    }

    suspend fun updateCollection(name: String, value: Int) {
        collectionDao.update(name, value)
    }

    suspend fun updateCollectionCount(name: String, value: Int) {
        collectionDao.updateCount(name, value)
    }

    suspend fun readIndexes(): List<Int?> {
        return collectionDao.getAll()
    }

    suspend fun getCollections(): List<CollectionEntity> {
        return collectionDao.getCollectionList()
    }


    suspend fun readDatabasePaged(key: Int, limit: Int, offset: Int): List<StaffEntity> {
        return staffDao.getPagedList(key, limit, offset)
    }

    suspend fun getSearchFilms(search: String, page: Int): List<MoviesFilms> {
        return retrofit.getFilmsByKeyword(search, page).items
    }

    suspend fun searchFilms(search: Map<String, String>, page: Int): List<MoviesFilms> {
        return retrofit.searchFilmsByKeyword(search, page).items
    }


    suspend fun getGenres(): SearchDTO {
        return retrofit.getCountriesGenres()
    }

    suspend fun getFilmDetails(id: Int): FilmInfoDTO {
        return retrofit.getFilmInfo(id)
    }

    suspend fun getSimilarFilms(id: Int): List<SimilarItems> {
        return retrofit.getSimilarFilms(id).items
    }

    suspend fun getFilmSeasones(id: Int): List<SeasonItems> {
        return retrofit.getFilmSeasons(id).items
    }

    suspend fun getFilmImages(id: Int, type: String, page: Int): ImagesDTO {
        return retrofit.getFilmImages(id, type, page)
    }

    suspend fun getFilmImagesList(id: Int, type: String, page: Int): List<ImageItems> {
        return retrofit.getFilmImages(id, type, page).items
    }

    suspend fun getStaffById(id: Int): StaffDTO {
        return retrofit.getStaffById(id)
    }

    suspend fun getFilmActors(filmId: Int): List<FilmStaffDTO> {

        val itemList = emptyList<StaffEntity>().toMutableList()
        var result = emptyList<FilmStaffDTO>()
        try {
            result = retrofit.getFilmStaff(filmId)

        } catch (e: Exception) {
            val errorMessage = e.localizedMessage
        }

        staffDao.delete()
        result.forEach {
            val item = StaffEntity(0, "")
            item.staffId = it.staffId!!
            item.nameRu = it.nameRu
            item.nameEn = it.nameEn
            item.posterUrl = it.posterUrl
            item.description = it.description
            item.professionText = it.professionText
            item.professionKey = it.professionKey!!
            itemList.add(item)
        }
        staffDao.insertAll(itemList)
        return result
    }

    suspend fun getPremieres(year: Int, month: String): List<MoviesFilms> {
        return retrofit.getPremieres(year, month).items
    }


    suspend fun getTop250(page: Int): List<MoviesFilms> {
        return retrofit.topList(page).films
    }

    suspend fun getSerials(page: Int): List<MoviesFilms> {
        return retrofit.getSerials(page).items
    }

    suspend fun getTopPopular(page: Int): List<MoviesFilms> {
        return retrofit.topPopular(page).films
    }

    suspend fun getRandom(country: Int, genre: Int, page: Int): List<MoviesFilms> {
        return retrofit.getRandom(country, genre, page).items
    }
}