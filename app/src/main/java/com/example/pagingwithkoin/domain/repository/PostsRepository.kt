package com.example.pagingwithkoin.domain.repository

import com.example.pagingwithkoin.data.remote.dto.response.Posts

interface PostsRepository {
    suspend fun getAllPosts(): List<Posts>
}