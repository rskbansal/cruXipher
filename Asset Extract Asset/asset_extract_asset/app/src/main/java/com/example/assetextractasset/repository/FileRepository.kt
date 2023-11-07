package com.example.assetextractasset.repository

import androidx.lifecycle.LiveData
import com.example.assetextractasset.db.FileDao
import com.example.assetextractasset.models.Files

class FileRepository(private val fileDao: FileDao) {

    val readFile: LiveData<Files> = fileDao.getFileById(1)

    suspend fun insertFile(files: Files){
        fileDao.insertFile(files)
    }

}