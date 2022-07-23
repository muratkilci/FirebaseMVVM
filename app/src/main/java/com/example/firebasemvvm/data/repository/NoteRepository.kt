package com.example.firebasemvvm.data.repository

import com.example.firebasemvvm.data.model.Note

interface NoteRepository {
    fun getNotes():List<Note>


}