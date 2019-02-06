package com.example.blog.web

import com.example.blog.model.RegisterModel
import com.example.blog.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class RegisterController(
        private val userRepository: UserRepository
        , private val passwordEncoder: PasswordEncoder
) {
    @GetMapping("/register")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        model.addAttribute("form", RegisterModel())
        return "register"
    }

    @PostMapping("/register")
    fun register(@ModelAttribute("form") @Validated form: RegisterModel, result: BindingResult, model: Model): String {
        if (result.hasErrors()) {
            model.addAttribute("appName", "Kotlin Blog")
            return "register"
        }

        return "redirect:/home/"
    }
}