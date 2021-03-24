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

    @RequestMapping("/img_default_avatar", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getDefaultAvatar(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/img_default_avatar.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/img_tnxh", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_JPEG_VALUE))
    @Throws(IOException::class)
    fun getBanner1(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/img_te_nan_xa_hoi.jpeg")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_home", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getHomeIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("home_icons/ic_home_outlined.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_home_filled", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getHomeIconFilled(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("home_icons/ic_home_filled.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_request", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getRequestIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("home_icons/ic_requests_outlined.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_task", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getTaskIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("home_icons/ic_tasks_outlined.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }

    @RequestMapping("/ic_notification", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.IMAGE_PNG_VALUE))
    @Throws(IOException::class)
    fun getNotificationIcon(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("home_icons/ic_notification_outlined.png")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(InputStreamResource(imgFile.inputStream))
    }
}