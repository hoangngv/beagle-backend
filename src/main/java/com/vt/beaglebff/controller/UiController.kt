package com.vt.beaglebff.controller

import com.vt.beaglebff.service.FirstScreenBeagleService
import com.vt.beaglebff.service.LoginScreenService
import com.vt.beaglebff.service.PersonalScreenService
import com.vt.beaglebff.service.SingleComponentService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/uiController")
class UiController(
        private val personalScreenService: PersonalScreenService,
        private val firstScreenBeagleService: FirstScreenBeagleService,
        private val loginScreenService: LoginScreenService,
        private val singleComponentService: SingleComponentService
) {

    @GetMapping("/screen")
    fun getFirstScreen() = firstScreenBeagleService.createScreenBeagle()

    @GetMapping("/personal")
    fun getHomeScreen() = personalScreenService.createPersonalScreen()

    @GetMapping("/login")
    fun getLoginScreen() = loginScreenService.createLoginScreen()

    @GetMapping("/buttonComponent")
    fun getButtonComponent() = singleComponentService.createButtonComponent()
}