package com.example.firebasemvvm.data.repository


import com.example.firebasemvvm.data.model.Note
import com.example.firebasemvvm.data.model.User
import com.example.firebasemvvm.util.UiState

interface NoteRepository {
    fun getNotes(user: User?, result: (UiState<List<Note>>) -> Unit)
    fun addNote(note: Note, result: (UiState<Pair<Note,String>>) -> Unit)
    fun updateNote(note: Note, result: (UiState<String>) -> Unit)
    fun deleteNote(note: Note, result: (UiState<String>) -> Unit)
}