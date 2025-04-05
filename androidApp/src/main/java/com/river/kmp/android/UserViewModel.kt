package com.river.kmp.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.river.kmp.domain.model.User
import com.river.kmp.domain.usecase.GetUsersUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel(
    private val getUsersUseCase: GetUsersUseCase
) : ViewModel() {

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    fun loadUsers() {
        viewModelScope.launch {
            val result = getUsersUseCase()
            _users.value = result
        }
    }
}