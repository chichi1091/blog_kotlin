package com.example.blog.repository

import com.example.blog.entity.BlogEntity

interface BlogRepository {
    fun selectAll(): List<BlogEntity>
}