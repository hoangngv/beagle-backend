package com.vt.beaglebff.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.PageView
import br.com.zup.beagle.widget.pager.PageIndicator
import com.vt.beaglebff.components.actions.ToastAction
import com.vt.beaglebff.components.widgets.BottomNavigationView

object WidgetBuilder : BaseBuilder(){

    // bottom navigation
    fun createBottomNavigationView() : Container {
        val menuItems = ArrayList<Array<String>>()

        menuItems.addAll(
                listOf(
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
                )
        )

        return getContainer(BottomNavigationView(menuItems))
    }

    // banner
    fun createBannerView() = getContainer(
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
    ).applyStyle(
            style = Style(
                    size = Size(width = 100.unitPercent(), height = 25.unitPercent())
            )
    )

    private fun createBannerImage(remoteUrl: String) = getImageViewFromRemote(
            remoteUrl = remoteUrl
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

    // toolbar
    fun createToolbar(backgroundColor: String? = "#3596EC") = getContainer(
            createHeader(),
            createSearchBar()
    ).applyStyle(
            style = Style(
                    backgroundColor = backgroundColor
            )
    )

    // header
    fun createHeader() = getContainer(
            getTextView("Xin chào", "WhiteNormalText"),
            getContainer(
                    getTouchableIcon(
                            remoteUrl = "http://10.0.2.2:8080/resourcesController/ic_notification_white",
                            width = 30,
                            height = 30,
                            listAction = listOf(
                                    ToastAction("Không có thông báo mới nào")
                            )
                    ),
                    getCircularTextView(
                            text = "HN",
                            width = 44,
                            height = 44,
                            listAction = listOf(
                                    Navigate.PushView(route = Route.Remote("/uiController/personal"))
                            )
                    )
            ).applyFlex(
                    flex = Flex(
                            flexDirection = FlexDirection.ROW,
                            alignItems = AlignItems.CENTER
                    )
            )
    ).applyStyle(
            style = Style(
                    margin = EdgeValue(
                            top = 20.unitReal(),
                            left = 20.unitReal(),
                            right = 20.unitReal()
                    )
            )
    ).applyFlex(
            flex = Flex(
                    flexDirection = FlexDirection.ROW,
                    alignItems = AlignItems.CENTER,
                    justifyContent = JustifyContent.SPACE_BETWEEN,
                    grow = 1.0
            )
    )

    // search bar
    fun createSearchBar() = getContainer(
            getImageViewFromLocal("ic_search")
                    .applyStyle(
                            Style(
                                    size = Size(width = 24.unitReal(), height = 24.unitReal()),
                                    margin = EdgeValue(right = 11.unitReal())
                            )
                    ),
            getTextInput("Công việc, yêu cầu, ứng dụng")
    ).applyStyle(
            Style(
                    margin = EdgeValue(horizontal = 20.unitReal(), vertical = 20.unitReal()),
                    backgroundColor = "#ffffff",
                    padding = EdgeValue(horizontal = 11.unitReal()),
                    size = Size(height = 44.unitReal()),
                    cornerRadius = CornerRadius(22.0),
                    flex = Flex(
                            FlexDirection.ROW,
                            alignItems = AlignItems.CENTER
                    )
            )
    )
}