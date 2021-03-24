package com.vt.beaglebff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.PageView
import br.com.zup.beagle.widget.layout.ScrollView
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.*
import com.vt.beaglebff.components.actions.ToastAction
import com.vt.beaglebff.components.widgets.BottomNavigationView
import com.vt.beaglebff.model.Person

class SingleComponentBuilder() {

    fun createButton(): Button {
        return Button(
                text = "Server-driven button",
                onPress = listOf(
                        Alert(
                                title = "Server-driven Button",
                                message = "I'm a server-based button"
                        )
                )
        )
    }

    fun createBottomNavigationView() : Container {
        val menuItems = ArrayList<Array<String>>()

        menuItems.addAll(listOf(
                arrayOf(
                        "http://10.0.2.2:8080/resourcesController/ic_home",
                        "Home",
                        "/uiController/tabHome"
                ),
                arrayOf(
                        "http://10.0.2.2:8080/resourcesController/ic_task",
                        "Tasks",
                        "/uiController/tabTask"
                ),
                arrayOf(
                        "http://10.0.2.2:8080/resourcesController/ic_request",
                        "Requests",
                        "/uiController/tabRequest"
                ),
                arrayOf(
                        "http://10.0.2.2:8080/resourcesController/ic_notification",
                        "Notifications",
                        "/uiController/tabNotification"
                )
        ))

        return Container(
                children = listOf(
                        BottomNavigationView(menuItems)
                )
        ).applyStyle(
                Style(
                        flex = Flex(
                                justifyContent = JustifyContent.FLEX_END,
                                grow = 1.0
                        )
                )
        )
    }

    fun createBannerView() = Container(
            children = listOf(
                    PageView(
                            context = ContextData(
                                    id = "bannerUrl",
                                    value = listOf(
                                            "http://10.0.2.2:8080/resourcesController/img_tnxh",
                                            "http://10.0.2.2:8080/resourcesController/img_tnxh"
                                    )
                            ),
                            pageIndicator = PageIndicator(
                                    selectedColor = "#000000",
                                    unselectedColor = "#888888"
                            ),
                            children = listOf(
                                    createBannerImage("@{bannerUrl[0]}"),
                                    createBannerImage("@{bannerUrl[1]}")
                            )
                    )
            )
    ).applyStyle(
            style = Style(
                    size = Size(width = 100.unitPercent(), height = 25.unitPercent()),
                    margin = EdgeValue(horizontal = 8.unitReal(), top = 16.unitReal())
            )
    )

    // tab home
    fun createTabHome() = Container(
            children = listOf(
                    PageView(
                            context = ContextData(
                                    id = "bannerUrl",
                                    value = listOf(
                                            "http://10.0.2.2:8080/resourcesController/img_tnxh",
                                            "http://10.0.2.2:8080/resourcesController/img_tnxh"
                                    )
                            ),
                            pageIndicator = PageIndicator(
                                    selectedColor = "#000000",
                                    unselectedColor = "#888888"
                            ),
                            children = listOf(
                                    createBannerImage("@{bannerUrl[0]}"),
                                    createBannerImage("@{bannerUrl[1]}")
                            )
                    )
            )
    ).applyStyle(
            style = Style(
                    size = Size(width = 100.unitPercent(), height = 25.unitPercent())
            )
    )

    // tab request
    fun createTabRequest() : Container {
        val characters = listOf(
                Person(
                        name = "Kelsier",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 38,
                        sex = "male"
                ),
                Person(
                        name = "Vin",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 20,
                        sex = "female"
                ),
                Person(
                        name = "TenSoon",
                        race = "Kandra",
                        planet = "Scadrial",
                        isMistborn = false,
                        age = 40,
                        sex = "male"
                ),
                Person(
                        name = "Kelsier",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 38,
                        sex = "male"
                ),
                Person(
                        name = "Vin",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 20,
                        sex = "female"
                ),
                Person(
                        name = "TenSoon",
                        race = "Kandra",
                        planet = "Scadrial",
                        isMistborn = false,
                        age = 40,
                        sex = "male"
                ),
                Person(
                        name = "Kelsier",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 38,
                        sex = "male"
                ),
                Person(
                        name = "Vin",
                        race = "Half-skaa",
                        planet = "Scadrial",
                        isMistborn = true,
                        age = 20,
                        sex = "female"
                ),
                Person(
                        name = "TenSoon",
                        race = "Kandra",
                        planet = "Scadrial",
                        isMistborn = false,
                        age = 40,
                        sex = "male"
                )
        )
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

    private fun createBannerImage(remoteUrl: String) = Image(
            path = ImagePath.Remote(remoteUrl),
            mode = ImageContentMode.CENTER_CROP
    ).applyStyle(
            Style(
                    margin = EdgeValue(
                            top = 16.unitReal(),
                            left = 16.unitReal(),
                            right = 16.unitReal(),
                            bottom = 8.unitReal()
                    ),
                    cornerRadius = CornerRadius(48.0)
            )
    )
}