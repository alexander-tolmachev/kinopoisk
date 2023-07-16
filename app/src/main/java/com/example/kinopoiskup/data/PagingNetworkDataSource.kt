package com.example.kinopoiskup.data

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kinopoiskup.entity.MoviesFilms
import com.example.kinopoiskup.entity.QueryItem


class PagingNetworkDataSource(private val repository: MainRepository, private val request: QueryItem) : PagingSource<Int, MoviesFilms>() {


    override fun getRefreshKey(state: PagingState<Int, MoviesFilms>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MoviesFilms> {

        val page = params.key ?: FIRST_PAGE
        return kotlin.runCatching {
            when (request.query) {
                1 -> repository.getTopPopular(page)
                2 -> repository.getTop250(page)
                3 -> repository.getSerials(page)
                4 -> repository.getRandom(request.param1!!,request.param2!!,page)
                5 -> repository.searchFilms(request.param3!!,page)

                else -> repository.getTopPopular(page)
            }

        }.fold(
            onSuccess = {
                var dbItem: Long? = null
                it.forEach {
                    if (it.kinopoiskId != null)

                    dbItem = repository.getFilmBitmask(it.kinopoiskId!!)
                    else if (it.filmId != null)

                        dbItem = repository.getFilmBitmask(it.filmId!!)
                    if (dbItem != null) it.bitmask = dbItem
                }    // TODO end

                LoadResult.Page(
                    data = it,
                    prevKey = null,
                    nextKey = if (it.isEmpty()) null else page + 1
                )
            },
            onFailure = {
                //Log.d("HeccjNehbcnj","paging network data sourse error ${it}")
                LoadResult.Error(it) } // возвращаем объект loadresulterror с кодом ошибки
        )
    }

    private companion object {
        private const val FIRST_PAGE = 1  // it vary!
    }
}