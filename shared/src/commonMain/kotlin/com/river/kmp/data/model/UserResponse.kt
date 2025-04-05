package com.river.kmp.data.model

import com.river.kmp.domain.model.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("email") val email: String
)

fun UserResponse.toDomain(): User = User(
    id = id,
    name = name,
    email = email
)