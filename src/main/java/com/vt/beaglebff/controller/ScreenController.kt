package com.vt.beaglebff.controller

import com.vt.beaglebff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(private val screenBeagleService: ScreenBeagleService) {

    @GetMapping("/screen")
    fun getFirstScreen() = screenBeagleService.createScreenBeagle()

    @GetMapping("/second-screen")
    fun getSecondScreen() = screenBeagleService.createScreenBeagle()
}