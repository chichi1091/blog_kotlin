package com.example.blog.repository.impl

import com.example.blog.dao.BlogDao
import com.example.blog.entity.BlogEntity
import com.example.blog.repository.BlogRepository
import org.springframework.stereotype.Repository

@Repository
class BlogRepositoryImpl(
        private val blogDao: BlogDao
): BlogRepository {

    override fun selectAll(): List<BlogEntity> {
        return blogDao.selectAll()
    }
}