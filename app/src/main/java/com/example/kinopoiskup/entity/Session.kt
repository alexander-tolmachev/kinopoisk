package com.example.kinopoiskup.entity

import android.content.Context
import android.content.SharedPreferences


class Session(context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor
    var _context: Context

    // shared pref mode
    var PRIVATE_MODE = 0

    init {
        _context = context
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }

    fun setFirstTimeLaunch(isFirstTime: Boolean) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime)
        editor.commit()
    }

    fun isFirstTimeLaunch(): Boolean {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true)
    }

    companion object {
        // Shared preferences file name
        private const val PREF_NAME = "snow-intro-slider"
        private const val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"
    }
}