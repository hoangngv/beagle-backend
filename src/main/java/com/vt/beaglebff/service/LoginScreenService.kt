package com.vt.beaglebff.service

import com.vt.beaglebff.builder.LoginScreenBuilder
import org.springframework.stereotype.Service

@Service
class LoginScreenService {
    fun createLoginScreen() = LoginScreenBuilder()
}