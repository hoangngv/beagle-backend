package com.vt.beaglebff.controller

import com.vt.beaglebff.service.ResourcesService
import org.springframework.core.io.InputStreamResource
import org.springframework.http.ResponseEntity
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import java.io.IOException
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/resourcesController")
class ResourcesController(resourcesService: ResourcesService) {

    @RequestMapping("/ic_account_info", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getAccountInfoIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_account_info.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_settings", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getSettingIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_settings.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_change_password", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getChangePasswordIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_change_password.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_info", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getInfoIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_info.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_logout", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getLogoutIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_logout.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_next", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getNextIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/ic_next.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }
}