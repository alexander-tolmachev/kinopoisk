package com.example.kinopoiskup.imageprocessing


import android.content.Context
import android.content.res.Resources
import android.graphics.Point
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.Display
import android.view.WindowManager


    object Utils {
        private const val WIDTH_INDEX = 0
        private const val HEIGHT_INDEX = 1
        fun getScreenSize(context: Context): IntArray {
            val widthHeight = IntArray(2)
            widthHeight[WIDTH_INDEX] = 0
            widthHeight[HEIGHT_INDEX] = 0
            val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val display: Display = windowManager.defaultDisplay
            val size = Point()
            display.getSize(size)
            widthHeight[WIDTH_INDEX] = size.x
            widthHeight[HEIGHT_INDEX] = size.y
            if (!isScreenSizeRetrieved(widthHeight)) {
                val metrics = DisplayMetrics()
                display.getMetrics(metrics)
                widthHeight[0] = metrics.widthPixels
                widthHeight[1] = metrics.heightPixels
            }

            // Last defense. Use deprecated API that was introduced in lower than API 13
            if (!isScreenSizeRetrieved(widthHeight)) {
                widthHeight[0] = display.getWidth() // deprecated
                widthHeight[1] = display.getHeight() // deprecated
            }
            return widthHeight
        }

        private fun isScreenSizeRetrieved(widthHeight: IntArray): Boolean {
            return widthHeight[WIDTH_INDEX] != 0 && widthHeight[HEIGHT_INDEX] != 0
        }

        fun convertDpToPixels(dp: Float): Int {
            return Math.round(
                TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP,
                    dp, Resources.getSystem().displayMetrics
                )
            )
        }


    }
