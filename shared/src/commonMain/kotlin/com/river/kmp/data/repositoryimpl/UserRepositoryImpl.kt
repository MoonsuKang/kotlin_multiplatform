package com.river.kmp.data.repositoryimpl

import com.river.kmp.data.api.UserApi
import com.river.kmp.data.model.toDomain
import com.river.kmp.domain.repository.UserRepository
import com.river.kmp.domain.model.User

class UserRepositoryImpl(
    private val api: UserApi
) : UserRepository {
    override suspend fun getUsers(): List<User> = api.fetchUsers().map { it.toDomain() }
}