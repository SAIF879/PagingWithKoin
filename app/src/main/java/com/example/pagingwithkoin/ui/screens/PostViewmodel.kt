package com.example.pagingwithkoin.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pagingwithkoin.data.remote.dto.response.Posts
import com.example.pagingwithkoin.domain.usecases.PostUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class UiState{
    data class Success(val posts: List<Posts>) : UiState()
    data class Error(val message: String) : UiState()
    data object Loading : UiState()
}

class PostViewModel(private val postUseCase: PostUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        getAllPosts()
    }

    private fun getAllPosts() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            val result = postUseCase.invoke()
            when {
                result.isSuccess -> {
                    _uiState.value = UiState.Success(result.getOrNull() ?: emptyList())
                }

                result.isFailure -> {
                    _uiState.value = UiState.Error(result.exceptionOrNull()?.localizedMessage ?: "Unknown error")
                }
            }
        }
    }
}
