package com.example.pagingwithkoin.data.remote.repository

import com.example.pagingwithkoin.data.remote.api.ApiService
import com.example.pagingwithkoin.data.remote.dto.response.Posts
import com.example.pagingwithkoin.domain.repository.PostsRepository

class PostsRepoImpl(val apiService: ApiService): PostsRepository{
    override suspend fun getAllPosts(): List<Posts> {
       val response = apiService.getAllPosts()
        if (response.isSuccessful){
            return response.body() ?: throw Exception("Empty response body")
        }
        else {
            throw Exception("HTTP ${response.code()} - ${response.message()}")
        }
    }

}