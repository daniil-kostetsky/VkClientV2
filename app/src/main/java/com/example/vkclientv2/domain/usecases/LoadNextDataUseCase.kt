package com.example.vkclientv2.domain.usecases

import com.example.vkclientv2.domain.repository.NewsFeedRepository
import javax.inject.Inject

class LoadNextDataUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {
    suspend operator fun invoke() {
        return repository.loadNextData()
    }
}