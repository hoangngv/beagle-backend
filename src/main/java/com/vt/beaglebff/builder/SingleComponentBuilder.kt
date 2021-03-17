package com.vt.beaglebff.builder

import br.com.zup.beagle.ext.setId
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.ui.Button
import com.vt.beaglebff.components.actions.ToastAction

class SingleComponentBuilder() {

    fun createButton(): Button {
//        /*return Button(
//                text = "Press to toast welcome msg",
//                onPress = listOf(ToastAction("Welcome from the backend!"))
//        )*/
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
}