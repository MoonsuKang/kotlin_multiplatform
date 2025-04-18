package com.river.kmp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.river.kmp.di.SharedUseCaseProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val useCase = SharedUseCaseProvider.provideGetUsersUseCase()
                    val viewModel: UserViewModel = viewModel(
                        factory = UserViewModelFactory(useCase)
                    )
                    UserListScreen(viewModel = viewModel)
                }
            }
        }
    }
}
