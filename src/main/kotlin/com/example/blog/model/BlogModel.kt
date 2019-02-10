package com.example.blog.model

import javax.validation.constraints.NotBlank

class BlogModel (
    var id: Int? = 0
    , @NotBlank
    var title: String = ""
    , @NotBlank
    var body: String = ""
)