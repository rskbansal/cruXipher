package com.example.assetextractasset.viewmodels

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assetextractasset.db.FileDatabase
import com.example.assetextractasset.models.Files
import com.example.assetextractasset.repository.FileRepository

class FileViewModel(application: Application): ViewModel() {

    private val dao = FileDatabase.getInstance(application).fileDao()
    private val repository = FileRepository(dao)

    val readFile: LiveData<Files> = repository.readFile
}

class FileViewModelFactory(
    private val application: Application
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FileViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FileViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}