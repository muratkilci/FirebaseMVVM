package com.example.firebasemvvm.note

import android.nfc.Tag
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.example.firebasemvvm.R
import com.example.firebasemvvm.databinding.FragmentNoteListingBinding

class NoteListingFragment : Fragment() {


    val TAG: String = "NoteListingFragment"
    lateinit var binding: FragmentNoteListingBinding
    val viewModel:NoteViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getNotes()
        viewModel.note.observe(viewLifecycleOwner){

        }

    }
}