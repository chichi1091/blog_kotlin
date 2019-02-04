package com.example.blog.model

import javax.validation.constraints.NotBlank

class LoginModel {
    @NotBlank
    val username: String = ""
    @NotBlank
    val password: String = ""
}