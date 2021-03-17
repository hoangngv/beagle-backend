package com.vt.beaglebff.builder

import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.ui.Button

class SingleComponentBuilder() {

    fun createButton(): Button {
        return Button(
                "Server-driven button",
                onPress = listOf(
                        Alert(
                                "Server-driven Button",
                                "I'm a server-based button",
                                labelOk = "OK"
                        )
                )
        )
    }
}