package com.vt.beaglebff.builder

import br.com.zup.beagle.core.*
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.*

class HomeScreenBuilder : ScreenBuilder {
    override fun build(): Screen {
        return Screen(
                child = Container(
                        children = listOf(
                                createToolbar(),
                                createBannerView(),
                                createBottomNavigationBar()
                        )
                )
        )
    }

    private fun createBannerView() = Container(
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
            Style(
                    size = Size(width = 100.unitPercent(), height = 50.unitPercent())
            )
    ).applyFlex(
            Flex(alignSelf = AlignSelf.CENTER, justifyContent = JustifyContent.FLEX_START)
    )

    private fun createToolbar() = Container(
            listOf(
                    Text("")
            )
    ).applyStyle(
            Style(backgroundColor = "#0F8E70",
                    size = Size(width = 100.unitPercent(), height = 56.unitReal()),
                    position = EdgeValue(0.unitReal()),
                    positionType = PositionType.RELATIVE)

    ).applyFlex(
            Flex(alignSelf = AlignSelf.CENTER, justifyContent = JustifyContent.FLEX_START)
    ).setId("widget")

    private fun createBannerImage(remoteUrl: String) = Image(
            path = ImagePath.Remote(remoteUrl),
            mode = ImageContentMode.CENTER_CROP
    ).applyStyle(
            Style(
                    margin = EdgeValue(all = 16.unitReal()),
                    cornerRadius = CornerRadius(32.0)
            )
    )

    private fun createBottomNavigationBar() = Container(
            children = listOf(
                    TabView(children =
                    listOf(
                            TabItem("Tab 1",
                                    Text("First Tab Content").applyFlex(flex = Flex(grow = 1.0))
                            ),
                            TabItem("Tab 2",
                                    Text("Second Tab Content").applyFlex(flex = Flex(grow = 1.0))
                            )
                    )
                    )
            )
    ).applyFlex(
            Flex(alignSelf = AlignSelf.CENTER, justifyContent = JustifyContent.FLEX_END)
    )
}