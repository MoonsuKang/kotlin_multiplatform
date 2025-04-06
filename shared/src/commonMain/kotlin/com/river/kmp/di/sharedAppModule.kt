package com.river.kmp.di

import com.river.kmp.data.api.UserApi
import com.river.kmp.data.repositoryimpl.UserRepositoryImpl
import com.river.kmp.domain.repository.UserRepository
import com.river.kmp.domain.usecase.GetUsersUseCase
import org.koin.dsl.module

val sharedAppModule = module {
    single { UserApi() }
    single<UserRepository> { UserRepositoryImpl(get()) }
    factory { GetUsersUseCase(get()) }
}