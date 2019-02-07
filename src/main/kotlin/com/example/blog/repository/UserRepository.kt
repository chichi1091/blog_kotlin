package com.example.blog.repository

import com.example.blog.entity.UserEntity
import org.seasar.doma.jdbc.Result
import java.util.*

interface UserRepository {
    fun selectAll(): List<UserEntity>
    fun selectLoginUser(username: String, password: String): Optional<UserEntity>
    fun insert(user: UserEntity): Result<UserEntity>
}