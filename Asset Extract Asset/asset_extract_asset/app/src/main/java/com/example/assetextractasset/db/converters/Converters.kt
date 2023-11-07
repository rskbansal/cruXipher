package com.example.assetextractasset.db.converters

import android.graphics.Bitmap
import android.util.Base64
import android.util.Base64.DEFAULT
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {
    @TypeConverter
    fun bitMapToString(bitmap: Bitmap): String? {
        val byteArrayStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayStream)
        val byteArray = byteArrayStream.toByteArray()
        return Base64.encodeToString(byteArray, DEFAULT)
    }

    @TypeConverter
    fun stringToBitMap(encodedString: String?): Bitmap? {
        // FIXME: Looks like ChatGPT forgot to fill this in
    }
}