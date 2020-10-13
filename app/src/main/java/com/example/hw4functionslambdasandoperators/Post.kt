package com.example.hw4functionslambdasandoperators

import android.net.Uri

data class Post(
    val id: Int,
    val icon: Int,
    val dateForPost: Long,
    val author: String,
    val content: String,
    val location: String,
    val link: String,
    var likedByMe: Boolean = false,
    var registeredLikes: Int = 0,
    var commentedByMe: Boolean = false,
    var registeredComments: Int = 0,
    var sharedByMe: Boolean = false,
    var registeredShares: Int = 0) {}