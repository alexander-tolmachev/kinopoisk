package com.example.kinopoiskup.entity

data class RecyclerItem (
    var title: String? = null,
    var mark: String? = null,
    var line: Int? = null,
    var param1: Int? = null,
    var param2: Int? = null,
    var param3: MutableMap<String, String>? = null,
    var type: Int = 0,
    var position: Int = 0,
    var list: List<MoviesFilms>? = null,
    var stafflist: List<FilmStaffDTO>? = null,
    var imagelist: List<ImageItems>? = null,
    var similars: List<SimilarItems>? = null,
    var films: List<StaffFilms>? = null,
    var collections: List<CollectionEntity>? = null,
    var episodes: List<Episodes>? = null
)
