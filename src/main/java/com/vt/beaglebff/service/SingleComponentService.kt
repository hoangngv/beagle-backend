package com.vt.beaglebff.service

import com.vt.beaglebff.builder.SingleComponentBuilder
import org.springframework.stereotype.Service

@Service
class SingleComponentService {

    fun createButtonComponent() = SingleComponentBuilder().createButton()
}