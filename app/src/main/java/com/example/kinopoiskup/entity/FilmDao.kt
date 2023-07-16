package com.example.kinopoiskup.entity

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmDao {

    @Query("SELECT * FROM films_table WHERE bitmask & :bitset > 0")
    suspend fun getFilmsByCategory(bitset: Long): List<FilmEntity>

    @Query("SELECT * FROM films_table WHERE bitmask=0 ORDER BY timestamp DESC")
    suspend fun getFilmsAndActors(): List<FilmEntity>

    @Query("UPDATE films_table SET bitmask=bitmask & :target WHERE bitmask & :bitset > 0")
    suspend fun cleanFilmsCategory(bitset: Long, target: Long)

    @Query("DELETE FROM films_table WHERE kinopoiskId=:id")
    suspend fun deleteFilmById(id: Int)

    @Query("DELETE FROM films_table WHERE bitmask & :bitset > 0")
    suspend fun deleteFilmsByCategory(bitset: Long)

    @Query("DELETE FROM films_table WHERE bitmask = 0")
    suspend fun deleteFilms()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: FilmEntity): Long

    @Query("UPDATE films_table SET bitmask=:bitmask WHERE kinopoiskId=:id")
    suspend fun updateFilmById(id: Int, bitmask: Long)

    @Query("SELECT bitmask FROM films_table WHERE kinopoiskId=:id LIMIT 1")
    suspend fun getFilmBitmask(id: Int): Long
}