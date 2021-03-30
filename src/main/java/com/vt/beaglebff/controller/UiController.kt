package com.vt.beaglebff.controller

import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.vt.beaglebff.service.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/uiController")
class UiController(
        private val homeScreenService: HomeScreenService,
        private val personalScreenService: PersonalScreenService,
        private val loginScreenService: LoginScreenService,
        private val tabService: TabService,
        private val myService: MyService
) {
    @GetMapping("/home")
    fun getHomeScreen() = homeScreenService.createHomeScreen()

    @GetMapping("/personal")
    fun getPersonalScreen() = personalScreenService.createPersonalScreen()

    @GetMapping("/login")
    fun getLoginScreen() = loginScreenService.createLoginScreen()

    @GetMapping("/tabHome")
    fun getTabHome() = tabService.createTabHome()

    @GetMapping("/tabRequest")
    fun getTabRequest() = tabService.createTabRequest()

    @GetMapping("/tabTask")
    fun getTabTask() = tabService.createTabTask()

    @GetMapping("/tabNotification")
    fun getTabNotification() = tabService.createTabNotification()

    @GetMapping("/minhScreen")
    fun getScreen() : ScreenBuilder = myService.getMyScreen()
}