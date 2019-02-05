package com.example.blog.repository.impl

import com.example.blog.dao.UserDao
import com.example.blog.entity.UserEntity
import com.example.blog.repository.UserRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepositoryImpl(
        private val userDao: UserDao
): UserRepository {
    override fun selectAll(): List<UserEntity> {
        return userDao.selectAll()
    }

    override fun selectLoginUser(email: String, password: String): Optional<UserEntity> {
        return userDao.selectLoginUser(email, password)
    }
}