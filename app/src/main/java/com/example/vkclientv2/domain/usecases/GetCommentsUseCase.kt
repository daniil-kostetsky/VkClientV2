package com.example.vkclientv2.domain.usecases

import com.example.vkclientv2.domain.entity.FeedPost
import com.example.vkclientv2.domain.entity.PostComment
import com.example.vkclientv2.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {
    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>> {
        return repository.getComments(feedPost = feedPost)
    }
}