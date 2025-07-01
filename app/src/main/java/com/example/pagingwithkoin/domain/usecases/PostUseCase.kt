package com.example.pagingwithkoin.domain.usecases

import com.example.pagingwithkoin.data.remote.dto.response.Posts
import com.example.pagingwithkoin.domain.repository.PostsRepository

class PostUseCase(private val repository: PostsRepository) {

    suspend operator fun invoke(): Result<List<Posts> >{
        return runCatching { repository.getAllPosts()}
    }

}