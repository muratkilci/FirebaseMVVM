package com.example.firebasemvvm.data.repository

import com.example.firebasemvvm.data.model.Note
import com.example.firebasemvvm.utiil.UiState

interface NoteRepository {
    fun getNotes(result:(UiState<List<Note>>)->Unit)
    fun addNote(note: Note,result:(UiState<String>)->Unit)


}