package com.example.blog.web

import com.example.blog.entity.UserEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpSession

@Controller
class HomeController(
        private val session: HttpSession
) {

    @GetMapping("/home")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        val user: UserEntity = session.getAttribute("userInfo") as UserEntity? ?: throw Exception("session timeout")
        model.addAttribute("isAuth", true)
        model.addAttribute("username", user.name)
        return "home"
    }
}