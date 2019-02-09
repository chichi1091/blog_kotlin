package com.example.blog.web

import com.example.blog.entity.UserEntity
import com.example.blog.model.BlogModel
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpSession

@Controller
@RequestMapping("/blog")
class BlogRegisterController(
        private val session: HttpSession
) {

    @GetMapping("/register")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        val user: UserEntity = session.getAttribute("userInfo") as UserEntity? ?: throw Exception("session timeout")
        model.addAttribute("isAuth", true)
        model.addAttribute("form", BlogModel())
        return "created"
    }
}