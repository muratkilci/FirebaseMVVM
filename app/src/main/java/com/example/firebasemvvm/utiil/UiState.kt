package com.example.firebasemvvm.utiil

sealed class UiState<out  T> {
    //Loading, Success, Failure
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Failure(val error: String?): UiState<Nothing>()
}

/*
* sealed class-> yalnızca kendisi ve alt sınıfları tarafından genişletilebilen bir sınıf oluşturmak için kullanılır.
*
* */