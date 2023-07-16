package com.example.kinopoiskup.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "films_table")
data class FilmEntity(
    @PrimaryKey
    @ColumnInfo(name = "kinopoiskId")
    var kinopoiskId: Int? = null,
    @ColumnInfo(name = "category")
    var category: Int? = null,
    @ColumnInfo(name = "timestamp")
    var timestamp: Long? = null,
    @ColumnInfo(name = "bitmask")
    var bitmask: Long? = null,
    @ColumnInfo(name = "name")
    var name: String? = null,
    @ColumnInfo(name = "poster")
    var poster: String? = null,
    @ColumnInfo(name = "genre")
    var genre: String? = null,
    @ColumnInfo(name = "rating")
    var rating: Double? = null
)


