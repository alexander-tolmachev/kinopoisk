package com.example.kinopoiskup.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kinopoiskup.entity.*

class PagingNetworkDataSourceGallery(private val repository: MainRepository, private val request: QueryItem) : PagingSource<Int, ImageItems>() {

    override fun getRefreshKey(state: PagingState<Int, ImageItems>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageItems> {

        val page = params.key ?: FIRST_PAGE
        return kotlin.runCatching {
        repository.getFilmImagesList(request.param1!!, request.param5!!, page)
        }.fold(
            onSuccess = {
                LoadResult.Page(
                    data = it,
                    prevKey = null,
                    nextKey = if (it.isEmpty()) null else page + 1
                )
            },
            onFailure = {
                LoadResult.Error(it) }
        )
    }

    private companion object {
        private const val FIRST_PAGE = 1
    }
}