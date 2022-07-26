package com.example.firebasemvvm.data.model

import android.os.Parcelable
import com.google.firebase.firestore.ServerTimestamp
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Note(
    var id: String = "",
    val title: String = "",
    val description: String = "",
    val tags: MutableList<String> = arrayListOf(),
    @ServerTimestamp
    val date: Date = Date(),
) : Parcelable
