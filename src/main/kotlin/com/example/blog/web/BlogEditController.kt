package com.example.blog.web

import com.example.blog.entity.BlogEntity
import com.example.blog.entity.UserEntity
import com.example.blog.model.BlogModel
import com.example.blog.repository.BlogRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpSession

@Controller
@RequestMapping("/blog")
class BlogEditController(
        private val session: HttpSession
        , private val blogRepository: BlogRepository
) {

    @GetMapping("edit/{id}")
    fun edit(@PathVariable("id") id: Int, model: Model): String{
        model.addAttribute("appName", "Kotlin Blog")
        session.getAttribute("userInfo") as UserEntity? ?: throw Exception("session timeout")
        model.addAttribute("isAuth", true)

        var entity: BlogEntity = blogRepository.selectId(id)
        if(entity != null) {
            model.addAttribute("form", BlogModel(entity.id!!, entity.title, entity.body))
        } else {
            throw Exception("not found")
        }
        return "edit"
    }

    @PostMapping("edit")
    fun edit(): String {
        return "redirect:/home/"
    }
}