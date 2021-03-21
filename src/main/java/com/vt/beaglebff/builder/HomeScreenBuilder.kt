package com.vt.beaglebff.builder

import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.vt.beaglebff.components.actions.NavigateAction
import com.vt.beaglebff.components.actions.ToastAction

class HomeScreenBuilder : ScreenBuilder {
    override fun build(): Screen {
        return Screen(
                navigationBar = NavigationBar(
                        title = "Home Screen",
                        navigationBarItems = listOf(
                                NavigationBarItem(
                                        text = "",
                                        image = ImagePath.Local.justMobile("ic_notification"),
                                        action = NavigateAction("/uiController/personal")
                                )
                        ),
                        showBackButton = false
                ),
                child = Container(
                        children = listOf(
                                Text(
                                        text = "Home Screen",
                                        styleId = "NormalText"
                                )
                        )
                )
        )
    }
}