package com.example.firebasemvvm.data.repository

import com.example.firebasemvvm.data.model.Note


class NoteRepositoryImp:NoteRepository {

    override fun getNotes(): List<Note> {
        //we will get data from firebase
        return arrayListOf()
    }


}