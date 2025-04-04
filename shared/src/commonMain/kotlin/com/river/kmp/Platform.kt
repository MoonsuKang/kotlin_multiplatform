package com.river.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform