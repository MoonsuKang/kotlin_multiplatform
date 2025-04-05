package com.river.kmp.domain.repository

import com.river.kmp.domain.model.User

interface UserRepository {
    suspend fun getUsers(): List<User>
}