package com.example.assetextractasset.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.example.assetextractasset.databinding.FragmentFileBinding
import com.example.assetextractasset.viewmodels.FileViewModel
import com.example.assetextractasset.viewmodels.FileViewModelFactory

class FileFragment : Fragment() {

    private lateinit var binding: FragmentFileBinding
    private lateinit var viewModel: FileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this, FileViewModelFactory(this.requireActivity().application))[FileViewModel::class.java]
        binding = FragmentFileBinding.inflate(layoutInflater)

        viewModel.readFile.observe(viewLifecycleOwner) {
            if(it != null) {
                binding.imageView.load(it.image)
            }
        }

        return binding.root
    }
}