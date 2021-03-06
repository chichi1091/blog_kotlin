package com.example.blog.web

import com.example.blog.model.LoginModel
import com.example.blog.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import javax.servlet.http.HttpSession

@Controller
class LoginController(
        private val userRepository: UserRepository
        , private val passwordEncoder: PasswordEncoder
        , private val session: HttpSession
) {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("appName", "Kotlin Blog")
        model.addAttribute("isAuth", false)
        model.addAttribute("form", LoginModel())
        return "login"
    }

    @PostMapping("/login")
    fun login(@ModelAttribute("form") @Validated form: LoginModel, result: BindingResult, model: Model): String {
        if (result.hasErrors()) {
            model.addAttribute("appName", "Kotlin Blog")
            model.addAttribute("isAuth", false)
            return "login"
        }

        val userOptional = userRepository.selectLoginUser(form.username)

        return if(userOptional.isPresent()) {
            val password = userOptional.get().password
            return if(passwordEncoder.matches(form.password, password)) {
                session.setAttribute("userInfo", userOptional.get())
                "redirect:/home/"
            } else {
                model.addAttribute("isError", true)
                "login"
            }
        } else {
            model.addAttribute("isError", true)
            "login"
        }
    }
}

