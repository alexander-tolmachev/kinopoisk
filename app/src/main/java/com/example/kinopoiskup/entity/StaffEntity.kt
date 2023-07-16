package com.example.kinopoiskup.entity


import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "actors_table", primaryKeys = ["staffId","professionKey"])
data class StaffEntity(
    @ColumnInfo (name = "staffId")
    var staffId: Int,
    @ColumnInfo(name = "professionKey")
    var professionKey: String,
    @ColumnInfo(name = "nameRu")
    var nameRu: String? = null,
    @ColumnInfo(name = "nameEn")
    var nameEn: String? = null,
    @ColumnInfo(name = "description")
    var description: String? = null,
    @ColumnInfo(name = "posterUrl")
    var posterUrl: String? = null,
    @ColumnInfo(name = "professionText")
    var professionText: String? = null
)
