package com.vt.beaglebff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.PageView
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import com.vt.beaglebff.components.actions.ToastAction
import com.vt.beaglebff.components.widgets.BottomNavigationView

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

        menuItems.add(arrayOf(
                "http://10.0.2.2:8080/resourcesController/ic_account_info",
                "Home",
                "/uiController/home")
        )

        menuItems.add(arrayOf(
                "http://10.0.2.2:8080/resourcesController/ic_account_info",
                "Requests",
                "/uiController/home")
        )

        menuItems.add(arrayOf(
                "http://10.0.2.2:8080/resourcesController/ic_account_info",
                "Tasks",
                "/uiController/home")
        )

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
    )

    private fun createBannerImage(remoteUrl: String) = Image(
            path = ImagePath.Remote(remoteUrl),
            mode = ImageContentMode.CENTER_CROP
    ).applyStyle(
            Style(
                    margin = EdgeValue(all = 16.unitReal()),
                    cornerRadius = CornerRadius(48.0)
            )
    )
}