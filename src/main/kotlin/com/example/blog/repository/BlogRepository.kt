package com.example.blog.repository

import com.example.blog.entity.BlogEntity
import org.seasar.doma.jdbc.Result

interface BlogRepository {
    fun selectId(id: Int): BlogEntity
    fun selectAll(): List<BlogEntity>
    fun insert(entity: BlogEntity): Result<BlogEntity>
    fun update(entity: BlogEntity): Result<BlogEntity>
    fun delete(entity: BlogEntity): Result<BlogEntity>
}