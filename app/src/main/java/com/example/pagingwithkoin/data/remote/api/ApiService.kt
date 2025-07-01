package com.example.pagingwithkoin.data.remote.api

import com.example.pagingwithkoin.data.remote.dto.response.Posts
import retrofit2.http.GET


interface ApiService {
    @GET("/posts")
    suspend fun getAllPosts() : retrofit2.Response<List<Posts>>
}