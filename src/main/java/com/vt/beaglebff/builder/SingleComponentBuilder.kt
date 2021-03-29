
package com.vt.beaglebff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.*
import com.vt.beaglebff.Constants
import com.vt.beaglebff.components.actions.BackAction
import com.vt.beaglebff.components.actions.ToastAction

class SingleComponentBuilder() {
    companion object {
        fun createMainToolbar() = Container(
                children = listOf(
                        Touchable(
                                child = Image(
                                        path = ImagePath.Remote("${Constants.baseUrl}/resourcesController/ic_back")
                                ).applyStyle(
                                        style = Style(
                                                size = Size(
                                                        width = Constants.sizeIcon.unitReal(),
                                                        height = Constants.sizeIcon.unitReal()
                                                ),
                                                margin = EdgeValue(
                                                        all = 8.unitReal(),
                                                        left = 16.unitReal()
                                                ),
                                                flex = Flex(
                                                        alignSelf = AlignSelf.CENTER
                                                )
                                        )
                                ),
                                onPress = listOf(
                                        BackAction("back")
                                )
                        ),
                        Container(
                                children = listOf()
                        ).applyStyle(
                                style = Style(
                                        size = Size(
                                                width = 20.unitReal(),
                                                height = 20.unitReal()
                                        )
                                )
                        ),
                        Text(
                                text = "This is title ahihi ahihi",
                                textColor = "#FFFFFF",
                                styleId = "TextTitleProfile"
                        ).applyStyle(
                                style = Style(
                                        flex = Flex(
                                                alignSelf = AlignSelf.CENTER
                                        )
                                )
                        ),
                        Container(
                                children = listOf(
                                        Touchable(
                                                child = Image(
                                                        path = ImagePath.Remote("${Constants.baseUrl}/resourcesController/ic_tick")
                                                ).applyStyle(
                                                        style = Style(
                                                                size = Size(
                                                                        width = Constants.sizeIcon.unitReal(),
                                                                        height = Constants.sizeIcon.unitReal()
                                                                ),
                                                                margin = EdgeValue(
                                                                        all = 8.unitReal()
                                                                ),
                                                                flex = Flex(
                                                                        alignSelf = AlignSelf.CENTER
                                                                ),
                                                                padding = EdgeValue(
                                                                        all = 4.unitReal()
                                                                )
                                                        )
                                                ),
                                                onPress = listOf(
                                                        ToastAction("Click read all!")
                                                )
                                        ),
                                        Touchable(
                                                child = Image(
                                                        path = ImagePath.Remote("${Constants.baseUrl}/resourcesController/ic_setting")
                                                ).applyStyle(
                                                        style = Style(
                                                                size = Size(
                                                                        width = Constants.sizeIcon.unitReal(),
                                                                        height = Constants.sizeIcon.unitReal()
                                                                ),
                                                                margin = EdgeValue(
                                                                        all = 8.unitReal(),
                                                                        right = 16.unitReal()
                                                                ),
                                                                flex = Flex(
                                                                        alignSelf = AlignSelf.CENTER
                                                                )
                                                        )
                                                ),
                                                onPress = listOf(
                                                        ToastAction("Click setting!")
                                                )
                                        )
                                )
                        ).applyStyle(
                                style = Style(
                                        flex = Flex(
                                                flexDirection = FlexDirection.ROW
                                        )
                                )
                        )
                )
        ).applyStyle(
                style = Style(
                        flex = Flex(
                                flexDirection = FlexDirection.ROW,
                                justifyContent = JustifyContent.SPACE_BETWEEN
                        ),
                        backgroundColor = "#3596EC",
                        size = Size(
                                height = 50.unitReal()
                        )
                )
        )
    }
}