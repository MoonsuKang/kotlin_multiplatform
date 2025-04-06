package com.river.kmp.android

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val androidAppModule = module {
    viewModel { UserViewModel(get()) }
}