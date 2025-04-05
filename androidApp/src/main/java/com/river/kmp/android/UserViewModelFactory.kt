package com.river.kmp.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.river.kmp.domain.usecase.GetUsersUseCase

class UserViewModelFactory(
    private val useCase: GetUsersUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UserViewModel(useCase) as T
    }
}