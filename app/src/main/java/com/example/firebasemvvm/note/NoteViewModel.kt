package com.example.firebasemvvm.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasemvvm.data.model.Note
import com.example.firebasemvvm.data.repository.NoteRepository

class NoteViewModel(
    val repository: NoteRepository
) : ViewModel() {

    val _notes = MutableLiveData<List<Note>>()
    val note: LiveData<List<Note>>
        get() = _notes

    fun getNotes() {
        _notes.value = repository.getNotes()
    }
}