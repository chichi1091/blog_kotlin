package com.example.blog.entity

import org.seasar.doma.*
import org.seasar.doma.jdbc.entity.NamingType

@Entity(immutable = true, naming = NamingType.SNAKE_UPPER_CASE)
@Table(name = "users")
data class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int
    , val name: String
    , val email: String
    , val password: String
)
