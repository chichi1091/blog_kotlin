package com.example.blog.model

import javax.validation.constraints.NotBlank

class BlogModel {
    @NotBlank
    var title: String = ""
    @NotBlank
    var body: String = ""
}