package com.river.kmp.domain.usecase

import com.river.kmp.domain.repository.UserRepository
import com.river.kmp.domain.model.User

class GetUsersUseCase(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): List<User> = repository.getUsers()
}
