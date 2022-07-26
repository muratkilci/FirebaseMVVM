package com.example.firebasemvvm.util

sealed class UiState<out T> {
    object Loading: UiState<Nothing>()
    data class Success<out T>(val data: T): UiState<T>()
    data class Failure(val error: String?): UiState<Nothing>()
}

/*
* sealed class-> yalnızca kendisi ve alt sınıfları tarafından genişletilebilen bir sınıf oluşturmak için kullanılır.
*
* */