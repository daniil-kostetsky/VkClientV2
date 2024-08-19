package com.example.vkclientv2.domain

import kotlin.random.Random

data class FeedPost(
    val id: String,
    val communityName: String,
    val publicationDate: String,
    val communityImageUrl: String,
    val contentText: String,
    val contentImageUrl: String?,
    val statistics: List<StatisticItem>,
    val isFavorite: Boolean
)