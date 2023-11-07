package com.example.assetextractasset.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.assetextractasset.models.Files

@Dao
interface FileDao {

    @Query("SELECT * FROM file_table WHERE id=:id")
    fun getFileById(id:Int): LiveData<Files>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFile(files: Files)

}