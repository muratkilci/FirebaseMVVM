package com.example.firebasemvvm.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firebasemvvm.data.model.Note
import com.example.firebasemvvm.data.repository.NoteRepository
import com.example.firebasemvvm.utiil.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    val repository: NoteRepository
) : ViewModel() {

    val _notes = MutableLiveData<UiState<List<Note>>>()
    val note: LiveData<UiState<List<Note>>>
        get() = _notes

    val _addNotes = MutableLiveData<UiState<String>>()
    val addNote: LiveData<UiState<String>>
        get() = _addNotes

    fun getNotes() {
        _notes.value = UiState.Loading
        repository.getNotes { _notes.value = it }
    }

    fun addNote(note: Note) {
        _addNotes.value = UiState.Loading
        repository.addNote(note) { _addNotes.value = it }
    }
}