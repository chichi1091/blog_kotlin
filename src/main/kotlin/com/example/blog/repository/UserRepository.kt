package com.example.blog.repository

import com.example.blog.entity.UserEntity
import java.util.*

interface UserRepository {
    fun selectAll(): List<UserEntity>
    fun selectLoginUser(email: String, password: String): Optional<UserEntity>
}