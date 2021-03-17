package com.vt.beaglebff.service

import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ResourcesService {

    fun getAccountInfoImage(): ResponseEntity<InputStreamResource> {
        val imgFile = ClassPathResource("images/img_te_nan_xa_hoi.jpg")
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(InputStreamResource(imgFile.inputStream))
    }
}