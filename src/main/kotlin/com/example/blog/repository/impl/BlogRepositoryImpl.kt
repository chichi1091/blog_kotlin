package com.example.blog.repository.impl

import com.example.blog.dao.BlogDao
import com.example.blog.entity.BlogEntity
import com.example.blog.repository.BlogRepository
import org.seasar.doma.jdbc.Result
import org.springframework.stereotype.Repository

@Repository
class BlogRepositoryImpl(
        private val blogDao: BlogDao
): BlogRepository {
    override fun selectId(id: Int): BlogEntity {
        return blogDao.selectId(id)
    }

    override fun insert(entity: BlogEntity): Result<BlogEntity> {
        return blogDao.insert(entity)
    }

    override fun selectAll(): List<BlogEntity> {
        return blogDao.selectAll()
    }
}