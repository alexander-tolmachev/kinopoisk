package com.example.kinopoiskup.data

import android.content.Context
import android.provider.Settings
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

private val Context.dataStore by preferencesDataStore("kinopoisk_preferences")

@Singleton
class DataStoreManager @Inject constructor(@ApplicationContext appContext: Context) {

    private val settingsDataStore = appContext.dataStore

    suspend fun updateShowCompleted(showCompleted: Boolean) {
        settingsDataStore.edit { preferences ->
            preferences[Settings.SHOW_COMPLETED] = showCompleted
        }
    }

    suspend fun updateIntPreference(value: Int, mode: Int) {
        settingsDataStore.edit { preferences ->
           if (mode==0)  preferences[Settings.ORDER_SELECTOR] = value // 0 - order selector
           if (mode==1)  preferences[Settings.TYPE_SELECTOR] = value // 1 - type selector
            if (mode==4)  preferences[Settings.RANGE_FROM] = value // 4 - 0
            if (mode==5)  preferences[Settings.RANGE_TO] = value // 5 - 10
        }
    }

    suspend fun updateStringPreference(value: String, mode: Int) {
        settingsDataStore.edit { preferences ->
            if (mode==0) preferences[Settings.COUNTRY_SELECTED] = value  // 0 - country
            if (mode==1)  preferences[Settings.GENRE_SELECTED] = value // 1 - genre
            if (mode==2)  preferences[Settings.YEAR_FROM] = value // 2 - 1000
            if (mode==3)  preferences[Settings.YEAR_TO] = value // 3 - 3000

        }
    }

    val readUserPreferences: Flow<UserPreferences> = settingsDataStore.data
        .catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }.map { preferences ->
            val showCompleted = preferences[Settings.SHOW_COMPLETED]?: false
            val orderSelector = preferences[Settings.ORDER_SELECTOR]?: 0
            val typeSelector = preferences[Settings.TYPE_SELECTOR]?: 0 // ?
            val countrySelected = preferences[Settings.COUNTRY_SELECTED]?: "" // ?
            val genreSelected = preferences[Settings.GENRE_SELECTED]?: ""
            val yearFrom = preferences[Settings.YEAR_FROM]?: "" // ?
            val yearTo = preferences[Settings.YEAR_TO]?: ""
            val rangeFrom = preferences[Settings.RANGE_FROM]?: 1
            val rangeTo = preferences[Settings.RANGE_TO]?: 10

            UserPreferences(showCompleted, orderSelector, typeSelector, countrySelected, genreSelected, yearFrom, yearTo, rangeFrom, rangeTo)
        }




    object Settings {
        val SHOW_COMPLETED = booleanPreferencesKey("show_completed")
        val NIGHT_MODE = intPreferencesKey("night_mode")
        val ORDER_SELECTOR = intPreferencesKey("order_selector")
        val TYPE_SELECTOR = intPreferencesKey("type_selector")
        val COUNTRY_SELECTED = stringPreferencesKey("country_selected")
        val GENRE_SELECTED = stringPreferencesKey("genre_selected")
        val YEAR_FROM = stringPreferencesKey("year_from")
        val YEAR_TO = stringPreferencesKey("year_to")
        val RANGE_FROM = intPreferencesKey("range_from")
        val RANGE_TO = intPreferencesKey("range_to")
    }

}