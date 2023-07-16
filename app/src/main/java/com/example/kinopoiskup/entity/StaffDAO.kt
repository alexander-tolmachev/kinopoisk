package com.example.kinopoiskup.entity

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StaffDao {

    @Query("SELECT * FROM actors_table WHERE (professionKey == 'ACTOR') = :key LIMIT :limit OFFSET :offset")
    suspend fun getPagedList(key: Int, limit: Int, offset: Int): List<StaffEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(actors: List<StaffEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: StaffEntity): Long

    @Query("DELETE FROM actors_table")
    suspend fun delete()
}