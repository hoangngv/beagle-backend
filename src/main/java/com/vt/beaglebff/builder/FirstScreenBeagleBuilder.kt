/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vt.beaglebff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.vt.beaglebff.components.actions.ToastAction

object FirstScreenBeagleBuilder : ScreenBuilder {

//    override fun build() =  Screen(
//            navigationBar = NavigationBar(
//                    title = "Beagle Screen",
//                    navigationBarItems = listOf(
//                            NavigationBarItem(
//                                    text = "",
//                                    image = ImagePath.Local.justMobile("informationImage"),
//                                    action = ToastAction("Helloooooo")
//                            )
//                    )
//            ),
//            child = Container(
//                    children = listOf(
//                            Text("Some text")
//                    )
//            )
//    )

    override fun build() = Screen(
            navigationBar = NavigationBar(
                    title = "Personal",
                    navigationBarItems = listOf(
                            NavigationBarItem(
                                    text = "",
                                    image = ImagePath.Local.justMobile("informationImage"),
                                    action = ToastAction("Ask for help")
                            )
                    )
            ),
            child = Container(
                    children = listOf(
                            Text(
                                    text = "Hello HoangNV65",
                                    styleId = "TextStyle"
                            ).applyStyle(
                                    Style(
                                            margin = EdgeValue(
                                                    top = 16.unitReal()
                                            ),
                                            flex = Flex(alignSelf = AlignSelf.CENTER)
                                    )
                            ),
                            Text(
                                    text = "Works at Viettel Networks"
                            ).applyStyle(
                                    Style(
                                            margin = EdgeValue(
                                                    left = 16.unitReal(),
                                                    right = 16.unitReal(),
                                                    top = 20.unitReal()
                                            )
                                    )
                            ),
                            Button(
                                    text = "Press to toast welcome msg",
                                    styleId = "button",
                                    onPress = listOf(ToastAction("Welcome from the backend!"))
                            ).applyStyle(
                                    Style(margin = EdgeValue(
                                            top = 20.unitReal(),
                                            left = 16.unitReal(),
                                            right = 16.unitReal()
                                        )
                                    )
                            )
                    )
            )
    )
}