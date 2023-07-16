package com.example.kinopoiskup.entity

import androidx.paging.PagingSource
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CollectionDao {

    @Query("SELECT * FROM collection_table ORDER BY name ASC LIMIT :limit OFFSET :offset")
    suspend fun getPagedList(limit: Int, offset: Int): List<CollectionEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun add(entity: CollectionEntity): Long

    @Query("DELETE FROM collection_table WHERE idx = :index")
    suspend fun delete(index: Int)

    @Query("UPDATE collection_table SET count=:count   WHERE name =:name")
    suspend fun update(name: String, count: Int)

    @Query("UPDATE collection_table SET count=count + :number  WHERE name =:name")
    suspend fun updateCount(name: String, number: Int)

    @Query("SELECT count FROM collection_table WHERE name =:name")
    suspend fun getCount(name: String): Int

    @Query("SELECT count FROM collection_table WHERE idx =:name")
    suspend fun getCountByIdx(name: Int): Int

    @Query("SELECT idx FROM collection_table")
    suspend fun getAll(): List<Int?>

    @Query("SELECT * FROM collection_table WHERE name =:name")
    fun getCollectionItem(name: String): Flow<CollectionEntity>

    @Query("SELECT * FROM collection_table ORDER BY idx DESC")
    suspend fun getCollectionList(): List<CollectionEntity>
}