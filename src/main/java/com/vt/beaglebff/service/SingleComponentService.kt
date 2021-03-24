package com.vt.beaglebff.service

import com.vt.beaglebff.builder.SingleComponentBuilder
import org.springframework.stereotype.Service

@Service
class SingleComponentService {

    fun createButtonComponent() = SingleComponentBuilder().createButton()

    fun createBottomNavigationView() = SingleComponentBuilder().createBottomNavigationView()

    fun createBannerView() = SingleComponentBuilder().createBannerView()

    fun createTabHome() = SingleComponentBuilder().createTabHome()

    fun createTabRequest() = SingleComponentBuilder().createTabRequest()

    fun createTabTask() = SingleComponentBuilder().createTabTask()

    fun createTabNotification() = SingleComponentBuilder().createTabNotification()
}