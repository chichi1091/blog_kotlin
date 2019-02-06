package com.example.blog.web

import com.example.blog.model.RegisterModel
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RegisterController{
    @GetMapping("/register")
    fun index(model: Model): String {
        model.addAttribute("form", RegisterModel())
        return "register"
    }
}