package com.vt.beaglebff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.*
import com.vt.beaglebff.model.populateData

class TabBuilder: BaseBuilder(){

    // tab home
    fun createTabHome() = getContainer(
            WidgetBuilder.createToolbar(),
            WidgetBuilder.createBannerView()
    ).applyFlex(
            flex = Flex(
                    grow = 1.0
            )
    )

    // tab request
    fun createTabRequest() : Container {
        val characters = populateData()
        return getContainer(
                ListView(
                        context = ContextData(id = "characters", value = characters),
                        dataSource = expressionOf("@{characters}"),
                        template = getContainer(
                                getTextView("Name: @{item.name}"),
                                getTextView("Race: @{item.race}"),
                                getTextView("Mistborn: @{item.isMistborn}"),
                                getTextView("Planet: @{item.planet}"),
                                getTextView("sex: @{item.sex}"),
                                getTextView("age: @{item.age}")
                        ).applyStyle(
                                Style(
                                        margin = EdgeValue(bottom = 20.unitReal())
                                )
                        )
                )
        )
    }


    // tab task
    fun createTabTask() = getContainer(
            getScrollView(
                    getTextView("Vertical ScrollView"),
                    getTextView("Vertical ScrollView"),
                    getTextView("Vertical ScrollView")
            )
    )

    // tab notification
    fun createTabNotification() = getContainer(
            getScrollView(
                    getTextView("Vertical ScrollView"),
                    getTextView("Vertical ScrollView"),
                    getTextView("Vertical ScrollView")
            )
    )
}