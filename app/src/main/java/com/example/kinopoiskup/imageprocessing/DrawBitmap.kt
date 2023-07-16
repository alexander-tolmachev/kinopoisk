package com.example.kinopoiskup.presentation

import android.graphics.*
import android.view.View
import android.view.View.MeasureSpec
import com.example.kinopoiskup.imageprocessing.Utils


object GraphicsUtils {

    private fun createBitmapFromView(view: View, width: Int, height: Int): Bitmap {
        if (width > 0 && height > 0) {
            view.measure(
                MeasureSpec.makeMeasureSpec(
                    Utils
                        .convertDpToPixels(width.toFloat()), MeasureSpec.EXACTLY
                ),
                MeasureSpec.makeMeasureSpec(
                    Utils
                        .convertDpToPixels(height.toFloat()), MeasureSpec.EXACTLY
                )
            )
        }
        view.layout(0, 0, view.measuredWidth, view.measuredHeight)
        val bitmap = Bitmap.createBitmap(
            view.measuredWidth,
            view.measuredHeight, Bitmap.Config.ARGB_8888
        )

        return bitmap
    }


    fun getResizedBitmap(bitmap: Bitmap): Bitmap? {
        val width = bitmap.width
        val height = bitmap.height

        val refCover = Bitmap.createBitmap(width, height + height / 6, Bitmap.Config.ARGB_8888)

        val refCanvas = Canvas(refCover)
        refCanvas.drawBitmap(bitmap, 0f, 0f, null)

        val matrix = Matrix()
        matrix.preScale(1f, -1f)

        val reflectionImage: Bitmap =
            Bitmap.createBitmap(bitmap, 0, 5 * height / 6, width, height / 6, matrix, false)

        refCanvas.drawBitmap(reflectionImage, 0f, height.toFloat(), null)


        val refPaint = Paint()

        val refShader = LinearGradient(
            0f,
            (height + height / 6).toFloat(),
            0f,
            height.toFloat(),
            -0x00ffffff,  // -0x00ffffff,
            0x00fffff1,
            Shader.TileMode.CLAMP
        )
        refPaint.shader = refShader
        refPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP)   //DST_IN)
        refCanvas.drawRect(
            0f,
            height.toFloat(),
            width.toFloat(),
            (refCover.height + height).toFloat(),
            refPaint
        )
        reflectionImage.recycle()
        bitmap.recycle()
        return refCover
    }
}