package com.example.kinopoiskup.data

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kinopoiskup.entity.CollectionDao
import com.example.kinopoiskup.entity.CollectionEntity

class MainPagingSource(
    private val dao: CollectionDao
) : PagingSource<Int, CollectionEntity>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CollectionEntity> {
        val page = params.key ?: 0

        return try {
            val entities = dao.getPagedList(params.loadSize, page * params.loadSize)


            LoadResult.Page(
                data = entities,
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (entities.isEmpty()) null else page + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, CollectionEntity>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}