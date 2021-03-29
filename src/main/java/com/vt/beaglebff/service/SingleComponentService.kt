package com.vt.beaglebff.service

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Display
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Condition
import br.com.zup.beagle.widget.action.RequestActionMethod
import br.com.zup.beagle.widget.action.SendRequest
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.ListView
import br.com.zup.beagle.widget.ui.TextInput
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