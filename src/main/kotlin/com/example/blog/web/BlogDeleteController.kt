package com.example.blog.web

import com.example.blog.entity.BlogEntity
import com.example.blog.repository.BlogRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*

@Controller
@RequestMapping("/blog")
class BlogDeleteController(
        private val blogRepository: BlogRepository
) {

    @GetMapping("delete/{id}")
    fun delete(@PathVariable("id") id: Int, model: Model): String {
        var entity = BlogEntity(id, "", 0, "", Date(), "")
        blogRepository.delete(entity)
        return "redirect:/home/"
    }
}