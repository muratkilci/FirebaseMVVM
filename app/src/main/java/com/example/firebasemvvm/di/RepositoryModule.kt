package com.example.firebasemvvm.di

import com.example.firebasemvvm.data.repository.AuthRepository
import com.example.firebasemvvm.data.repository.AuthRepositoryImp
import com.example.firebasemvvm.data.repository.NoteRepository
import com.example.firebasemvvm.data.repository.NoteRepositoryImp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(
        database: FirebaseFirestore
    ): NoteRepository{
        return NoteRepositoryImp(database)
    }

    @Provides
    @Singleton
    fun provideAutghRepository(
        database: FirebaseFirestore,
        auth: FirebaseAuth
    ): AuthRepository {
        return AuthRepositoryImp(auth,database)
    }
}