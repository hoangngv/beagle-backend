package com.vt.beaglebff.controller

import com.vt.beaglebff.service.*
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/uiController")
class UiController(
        private val homeScreenService: HomeScreenService,
        private val personalScreenService: PersonalScreenService,
        private val firstScreenBeagleService: FirstScreenBeagleService,
        private val loginScreenService: LoginScreenService,
        private val singleComponentService: SingleComponentService
) {
    @GetMapping("/screen")
    fun getFirstScreen() = firstScreenBeagleService.createScreenBeagle()

    @GetMapping("/home")
    fun getHomeScreen() = homeScreenService.createHomeScreen()

    @GetMapping("/personal")
    fun getPersonalScreen() = personalScreenService.createPersonalScreen()

    @GetMapping("/login")
    fun getLoginScreen() = loginScreenService.createLoginScreen()

    @GetMapping("/buttonComponent")
    fun getButtonComponent() = singleComponentService.createButtonComponent()

    @GetMapping("/bottomNavigationView")
    fun getHomeScreenBottomNavigationView() = singleComponentService.createBottomNavigationView()

    @GetMapping("/banner")
    fun getHomeScreenBannerView() = singleComponentService.createBannerView()

}