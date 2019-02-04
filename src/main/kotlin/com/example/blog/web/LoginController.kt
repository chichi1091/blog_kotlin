package com.example.blog.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LoginController {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        model.addAttribute("isAuth", false)
        return "login"
    }
}

