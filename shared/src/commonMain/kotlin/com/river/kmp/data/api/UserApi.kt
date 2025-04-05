package com.river.kmp.data.api

import com.river.kmp.data.model.UserResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class UserApi {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }
    }

    suspend fun fetchUsers(): List<UserResponse> =
        client.get("https://jsonplaceholder.typicode.com/users").body()
}
