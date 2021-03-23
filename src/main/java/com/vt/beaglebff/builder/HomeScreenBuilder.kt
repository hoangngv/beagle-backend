package com.vt.beaglebff.builder

import br.com.zup.beagle.core.*
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.pager.PageIndicator
import br.com.zup.beagle.widget.ui.*
import com.vt.beaglebff.components.actions.ToastAction
import br.com.zup.beagle.widget.core.JustifyContent
import com.vt.beaglebff.components.widgets.ItemRowDivider


class HomeScreenBuilder : ScreenBuilder {
    override fun build(): Screen {
        return Screen(
                child = Container(
                        children = listOf(
                                createToolbar(),
                                createBannerView(),
                                createBottomNavigationBar()
                        )
                ).applyStyle(
                        Style(
                                flex = Flex(
                                        grow = 1.0
                                )
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
            Flex(
                    alignSelf = AlignSelf.CENTER,
                    justifyContent = JustifyContent.FLEX_START
            )
    )

    private fun createToolbar() = Container(
            listOf(
                    Text("")
            )
    ).applyStyle(
            Style(backgroundColor = "#3596EC",
                    size = Size(width = 100.unitPercent(), height = 56.unitReal()),
                    position = EdgeValue(0.unitReal()),
                    positionType = PositionType.RELATIVE
            )

    ).applyFlex(
            Flex(
                    alignSelf = AlignSelf.CENTER,
                    justifyContent = JustifyContent.FLEX_START
            )
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
                    ItemRowDivider(
                            expressionOf("#B9B9B9"),
                            expressionOf("1"),
                            leftMargin = 0,
                            rightMargin = 0,
                            topMargin = 0,
                            bottomMargin = 0
                    ),
                    Container(
                            children = listOf(
                                    createBottomButton(
                                            text = "Home",
                                            remoteIconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info"
                                    ),
                                    createBottomButton(
                                            text = "Tasks",
                                            remoteIconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info"
                                    ),
                                    createBottomButton(
                                            text = "Requests",
                                            remoteIconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info"
                                    ),
                                    createBottomButton(
                                            text = "Chat",
                                            remoteIconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info"
                                    ),
                                    createBottomButton(
                                            text = "Notifications",
                                            remoteIconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info"
                                    )
                            )
                    ).applyFlex(
                            Flex(
                                    flexDirection = FlexDirection.ROW,
                                    flexWrap = FlexWrap.NO_WRAP
                            )
                    )
            )
    ).applyFlex(
            Flex(
                    flexDirection = FlexDirection.COLUMN
            )
    ).applyStyle(
            Style(
                    flex = Flex(
                            justifyContent = JustifyContent.FLEX_END,
                            grow = 1.0
                    ),
                    margin = EdgeValue(horizontal = 8.unitReal(), bottom = 16.unitReal())
            )
    )

    private fun createBottomButton(text: String, remoteIconUrl: String) = Touchable(
            child = Container(
                    children = listOf(
                            Image(
                                    path = ImagePath.Remote(remoteUrl = remoteIconUrl)
                            ).applyStyle(
                                    Style(
                                            size = Size(width = 40.unitReal(), height = 40.unitReal())
                                    )
                            ).applyFlex(
                                    Flex(
                                            alignSelf = AlignSelf.CENTER
                                    )
                            ),
                            Text(
                                    text = text,
                                    alignment = TextAlignment.CENTER,
                                    styleId = "BottomNavigationText"
                            ).applyFlex(
                                    Flex(
                                            alignSelf = AlignSelf.CENTER
                                    )
                            )
                    )
            ).applyFlex(
                    Flex(
                            flexDirection = FlexDirection.COLUMN,
                            flex = 1.0
                    )
            ).applyStyle(
                    Style(
                            margin = EdgeValue(all = 8.unitReal())
                    )
            ),
            onPress = listOf(ToastAction(text))
    )
}