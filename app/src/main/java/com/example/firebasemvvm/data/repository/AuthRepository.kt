package com.example.firebasemvvm.data.repository

import com.example.firebasemvvm.data.model.User
import com.example.firebasemvvm.util.UiState


interface AuthRepository {
    fun registerUser(email: String, password: String, user: User, result: (UiState<String>) -> Unit)
    fun updateUserInfo(user: User, result: (UiState<String>) -> Unit)
    fun loginUser(user: User, result: (UiState<String>) -> Unit)
    fun forgotPassword(user: User, result: (UiState<String>) -> Unit)
}