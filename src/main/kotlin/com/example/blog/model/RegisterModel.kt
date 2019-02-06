package com.example.blog.model

import javax.validation.constraints.NotBlank

class RegisterModel {
    @NotBlank
    var username: String = ""
    @NotBlank
    var email: String = ""
    @NotBlank
    var password: String = ""

}