package com.vt.beaglebff.controller

import com.vt.beaglebff.service.FirstScreenBeagleService
import com.vt.beaglebff.service.LoginScreenService
import com.vt.beaglebff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
        private val screenBeagleService: ScreenBeagleService,
        private val firstScreenBeagleService: FirstScreenBeagleService,
        private val loginScreenService: LoginScreenService
) {

    @GetMapping("/screen")
    fun getFirstScreen() = firstScreenBeagleService.createScreenBeagle()

    @GetMapping("/home")
    fun getHomeScreen() = screenBeagleService.createScreenBeagle()

    @GetMapping("/login")
    fun getLoginScreen() = loginScreenService.createLoginScreen()
}