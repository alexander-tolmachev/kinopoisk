package com.example.kinopoiskup.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "collection_table")
data class CollectionEntity(
    @PrimaryKey
    @ColumnInfo(name = "name")
    var name: String = "",
    @ColumnInfo(name = "count")
    var count: Int = 0,
    @ColumnInfo(name = "idx")
    var idx: Int? = null
)

