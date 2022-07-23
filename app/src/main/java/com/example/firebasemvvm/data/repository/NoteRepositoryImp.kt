package com.example.firebasemvvm.data.repository

import com.example.firebasemvvm.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*


class NoteRepositoryImp(
    val database:FirebaseFirestore
):NoteRepository {

    override fun getNotes(): List<Note> {
        //we will get data from firebase
        return arrayListOf(
            Note(
                id = "dasdsa",
                text = "this is a note1",
                date = Date()
            ),Note(
                id = "dasdsa",
                text = "this is a note2",
                date = Date()
            ),Note(
                id = "dasdsa",
                text = "this is a note3",
                date = Date()
            )
        )
    }


}