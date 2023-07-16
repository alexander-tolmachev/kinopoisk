package com.example.kinopoiskup.data


import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kinopoiskup.entity.StaffEntity

class PagingDatabaseSource(private val repository: MainRepository,  private val query: Int) :
    PagingSource<Int, StaffEntity>() {

    override fun getRefreshKey(state: PagingState<Int, StaffEntity>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, StaffEntity> {
        val page = params.key ?: 0
        return try {
            val response = repository.readDatabasePaged(query, params.loadSize, page * params.loadSize)
            LoadResult.Page(
                data = response,
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (response.isEmpty()) null else page + 1
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }
}