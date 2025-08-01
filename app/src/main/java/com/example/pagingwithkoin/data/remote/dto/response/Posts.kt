package com.example.pagingwithkoin.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("userId" ) var userId : Int?    = null,
    @SerializedName("id"     ) var id     : Int?    = null,
    @SerializedName("title"  ) var title  : String? = null,
    @SerializedName("body"   ) var body   : String? = null
)