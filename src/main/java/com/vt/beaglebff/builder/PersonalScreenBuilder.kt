package com.vt.beaglebff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.vt.beaglebff.components.actions.ToastAction
import com.vt.beaglebff.components.widgets.ItemRowDivider
import com.vt.beaglebff.components.widgets.ItemRowPersonal
import br.com.zup.beagle.widget.core.JustifyContent
import com.vt.beaglebff.components.actions.NavigateAction


class PersonalScreenBuilder : ScreenBuilder {

    private val buttonStyle = Style(margin = EdgeValue(
            left = 16.unitReal(),
            right = 16.unitReal(),
            top = 8.unitReal(),
            bottom = 8.unitReal()
        )
    )

    private val iconStyle = Style(
            size = Size(width = 40.unitReal(), height = 40.unitReal()),
            flex = Flex(alignSelf = AlignSelf.FLEX_END),
            margin = EdgeValue(
                    left = 16.unitReal()
            )
    )

    private val textStyle = Style(
            size = Size(
                    width = UnitValue(
                            33.0, type = UnitType.PERCENT
                    )
            )
    )

    override fun build() = Screen(
            child = ScrollView(scrollDirection = ScrollAxis.VERTICAL,
                    children = listOf(
                            createTouchableRow(
                                    text = "Thông tin tài khoản",
                                    iconUrl = "http://10.0.2.2:8080/resourcesController/ic_account_info",
                                    icon2Url = "http://10.0.2.2:8080/resourcesController/ic_next",
                                    destination = "account_information"
                            ),
                            ItemRowDivider(
                                    expressionOf("#B9B9B9"),
                                    expressionOf("1")
                            ),
                            createTouchableRow(
                                    text = "Cài đặt",
                                    iconUrl = "http://10.0.2.2:8080/resourcesController/ic_settings",
                                    icon2Url = "http://10.0.2.2:8080/resourcesController/ic_next",
                                    destination = "settings"
                            ),
                            ItemRowDivider(
                                    expressionOf("#B9B9B9"),
                                    expressionOf("1")
                            ),
                            createTouchableRow(
                                    text = "Đổi mật khẩu",
                                    iconUrl = "http://10.0.2.2:8080/resourcesController/ic_change_password",
                                    icon2Url = "http://10.0.2.2:8080/resourcesController/ic_next",
                                    destination = "change_password"
                            ),
                            ItemRowDivider(
                                    expressionOf("#B9B9B9"),
                                    expressionOf("1")
                            ),
                            createTouchableRow(
                                    text = "Thông tin",
                                    iconUrl = "http://10.0.2.2:8080/resourcesController/ic_info",
                                    icon2Url = "http://10.0.2.2:8080/resourcesController/ic_next",
                                    destination = "information"
                            ),
                            ItemRowDivider(
                                    expressionOf("#B9B9B9"),
                                    expressionOf("1")
                            ),
                            createTouchableRow(
                                    text = "Đăng xuất",
                                    iconUrl = "http://10.0.2.2:8080/resourcesController/ic_logout",
                                    icon2Url = "http://10.0.2.2:8080/resourcesController/ic_next",
                                    destination = "log_out"
                            )
                    )
            )
    )

    private fun createTouchableRow(text: String, iconUrl: String, icon2Url: String, destination: String) : Touchable{
        return Touchable(
                onPress = listOf(NavigateAction(destination)),
                child = Container(
                        children = listOf(
                            Image(
                                    path = ImagePath.Remote(
                                            remoteUrl = iconUrl
                                    )
                            ).applyStyle(
                                    Style(
                                            size = Size(width = 40.unitReal(), height = 40.unitReal())
                                    )
                            ).applyFlex(Flex(alignSelf = AlignSelf.CENTER)),
                            Text(
                                    text = text,
                                    styleId = "NormalText"
                            ).applyStyle(
                                    Style(
                                            margin = EdgeValue(
                                                    left = 16.unitReal(),
                                                    right = 16.unitReal()
                                            )
                                    )
                            ).applyFlex(
                                    Flex(
                                            grow = 1.0,
                                            justifyContent = JustifyContent.FLEX_START,
                                            alignSelf = AlignSelf.CENTER
                                    )
                            ),
                            Image(
                                    path = ImagePath.Remote(
                                            remoteUrl = icon2Url
                                    )
                            )
                            .applyStyle(
                                    Style(
                                            size = Size(
                                                    width = 12.unitReal(),
                                                    height = 12.unitReal())
                                    )
                            )
                            .applyFlex(Flex(alignSelf = AlignSelf.CENTER))
                        )
                )
                .applyFlex(Flex(flexDirection = FlexDirection.ROW, flexWrap = FlexWrap.NO_WRAP))
                .applyStyle(style = buttonStyle)
        )
    }

    private fun createText(text: String)
            = Text(text).applyStyle(style = textStyle)

    private fun createButton(buttonText: String, remoteUrl: String, styleId: String? = "ButtonRightArrow") = Container(
            children = listOf(
                    Image(ImagePath.Remote(remoteUrl = remoteUrl)).applyStyle(style = iconStyle),
                    Button(
                            text = buttonText,
                            styleId = styleId,
                            onPress = listOf(ToastAction(buttonText))
                    ).applyStyle(style = buttonStyle)
            )
    ).applyFlex(
            Flex(
                    flexDirection = FlexDirection.ROW,
                    alignContent = AlignContent.STRETCH
            )
    )
}