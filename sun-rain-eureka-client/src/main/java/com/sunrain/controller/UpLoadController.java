package com.sunrain.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author admin
 */
@RestController
public class UpLoadController {

    @PostMapping(value = "/uplaod", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(MultipartFile file) {
        return file.getOriginalFilename();
    }


}
