package com.vt.beaglebff.builder

import br.com.zup.beagle.builder.widget.size
import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.context.valueOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.*

class HomeScreenBuilder : ScreenBuilder {
    override fun build(): Screen {
        return Screen(
                child = Container(
                        children = listOf(
                                createBannerView()
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
                    flex = Flex(grow = 0.0),
                    size = Size(width = 100.unitPercent(), height = 50.unitPercent())
            )
    ).applyFlex(
            Flex(alignSelf = AlignSelf.CENTER)
    )

    private fun createBannerImage(remoteUrl: String) =
        Image(
                path = ImagePath.Remote(remoteUrl),
                mode = ImageContentMode.CENTER_CROP
        ).applyStyle(
                Style(
                        margin = EdgeValue(all = 16.unitReal()),
                        cornerRadius = CornerRadius(32.0)
                )
        )
}