package com.example.blog.repository

import com.example.blog.entity.BlogEntity
import org.seasar.doma.jdbc.Result

interface BlogRepository {
    fun selectAll(): List<BlogEntity>
    fun insert(entity: BlogEntity): Result<BlogEntity>
}