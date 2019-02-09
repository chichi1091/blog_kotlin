package com.example.blog.web

import com.example.blog.entity.BlogEntity
import com.example.blog.entity.UserEntity
import com.example.blog.model.BlogModel
import com.example.blog.repository.BlogRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*
import javax.servlet.http.HttpSession

@Controller
@RequestMapping("/blog")
class BlogRegisterController(
        private val session: HttpSession
        , private val blogRepository: BlogRepository
) {

    @GetMapping("/register")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        val user: UserEntity = session.getAttribute("userInfo") as UserEntity? ?: throw Exception("session timeout")
        model.addAttribute("isAuth", true)
        model.addAttribute("form", BlogModel())
        return "created"
    }

    @PostMapping("/register")
    fun register(@ModelAttribute("form") @Validated form: BlogModel, model: Model): String {
        val user: UserEntity = session.getAttribute("userInfo") as UserEntity? ?: throw Exception("session timeout")
        var entity: BlogEntity = BlogEntity(null, form.title, user.id!!, form.body, Date(), user.name)
        blogRepository.insert(entity)
        return "redirect:/home/"
    }
}