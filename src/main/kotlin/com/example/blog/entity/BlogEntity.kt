package com.example.blog.entity

import org.seasar.doma.*
import org.seasar.doma.jdbc.entity.NamingType
import java.util.*

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "blogs")
class BlogEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int?
        , val title: String
        , val userId: Int
        , val body: String
        , val createDatetime: Date
        , @Column(insertable = false, updatable = false)
        val name: String
)