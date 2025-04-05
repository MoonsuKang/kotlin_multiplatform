package com.river.kmp.di

import com.river.kmp.data.api.UserApi
import com.river.kmp.data.repositoryimpl.UserRepositoryImpl
import com.river.kmp.domain.repository.UserRepository
import com.river.kmp.domain.usecase.GetUsersUseCase

object SharedUseCaseProvider {
    fun provideGetUsersUseCase(): GetUsersUseCase {
        val api = UserApi()
        val repository: UserRepository = UserRepositoryImpl(api)
        return GetUsersUseCase(repository)
    }
}