package com.example.assetextractasset.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.assetextractasset.db.converters.Converters
import com.example.assetextractasset.models.Files

// FIXME: I wonder why ChatGPT added this line here
private const val PASSPHRASE = "ChatGPT"

@Database(entities = [Files::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class FileDatabase : RoomDatabase() {

    abstract fun fileDao(): FileDao

    // FIXME: How do I load "assets/secret"?
    companion object {
        @Volatile
        private var INSTANCE: FileDatabase? = null

        fun getInstance(context: Context): FileDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FileDatabase::class.java,
                        "file_database"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance

                }
                return instance

            }

        }

        fun destroyInstance() {

            if (INSTANCE?.isOpen == true) {
                INSTANCE?.close()
            }

            INSTANCE = null
        }
    }

}