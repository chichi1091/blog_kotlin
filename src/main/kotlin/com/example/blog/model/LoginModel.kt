package com.example.blog.model

import javax.validation.constraints.NotBlank

class LoginModel {
    @NotBlank
    var username: String = ""
    @NotBlank
    var password: String = ""
}