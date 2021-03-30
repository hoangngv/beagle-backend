package com.vt.beaglebff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.ScrollView
import br.com.zup.beagle.widget.ui.*
import com.vt.beaglebff.model.populateData

class TabBuilder {

    // tab home
    fun createTabHome() = Container(
            children = listOf(
                    WidgetBuilder.createToolbar(),
                    WidgetBuilder.createBannerView()
            )
    ).applyFlex(
            flex = Flex(
                    grow = 1.0
            )
    )

    // tab request
    fun createTabRequest() : Container {
        val characters = populateData()
        return Container(
                children = listOf(
                        ListView(
                                context = ContextData(id = "characters", value = characters),
                                dataSource = expressionOf("@{characters}"),
                                template = Container(
                                        children = listOf(
                                                Text("Name: @{item.name}", styleId = "NormalText"),
                                                Text("Race: @{item.race}", styleId = "NormalText"),
                                                Text("Mistborn: @{item.isMistborn}", styleId = "NormalText"),
                                                Text("Planet: @{item.planet}", styleId = "NormalText"),
                                                Text("sex: @{item.sex}", styleId = "NormalText"),
                                                Text("age: @{item.age}", styleId = "NormalText")
                                        )
                                ).applyStyle(
                                        Style(
                                                margin = EdgeValue(bottom = 20.unitReal())
                                        )
                                )
                        )
                )
        )
    }


    // tab task
    fun createTabTask() = Container(
            children = listOf(
                    ScrollView(scrollDirection = ScrollAxis.VERTICAL,
                            children = listOf(
                                    Text("Vertical ScrollView", styleId = "NormalText"),
                                    Text("Vertical ScrollView", styleId = "NormalText"),
                                    Text("Vertical ScrollView", styleId = "NormalText")
                            )
                    )
            )
    )

    // tab notification
    fun createTabNotification() = Container(
            children = listOf(
                    ScrollView(scrollDirection = ScrollAxis.VERTICAL,
                            children = listOf(
                                    Text("Vertical ScrollView", styleId = "NormalText"),
                                    Text("Vertical ScrollView", styleId = "NormalText"),
                                    Text("Vertical ScrollView", styleId = "NormalText")
                            )
                    )
            )
    )
}