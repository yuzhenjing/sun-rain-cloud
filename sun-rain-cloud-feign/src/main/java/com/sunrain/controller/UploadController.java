package com.sunrain.controller;

import com.sunrain.service.FeignUploadFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Api("UploadController")
public class UploadController {

    @Autowired
    private FeignUploadFileService uploadFileService;

    @PostMapping(value = "/upload")
    public String upload(@ApiParam MultipartFile file) {
        return uploadFileService.fileUpload(file);
    }


}
