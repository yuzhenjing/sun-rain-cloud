package com.sunrain.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author admin
 */
@FeignClient(name = "EUREKA-CLIENT-1",fallback = FeignUploadFileServiceFallBack.class)
public interface FeignUploadFileService {

    /**
     * 使用feign  进行文件上传   consumer  和produces 必须设定
     *
     * @param file
     * @return
     * @RequestParam适用于name-valueString类型的请求域，
     * @RequestPart适用于复杂的请求域（像JSON，XML）。
     */
    @PostMapping(value = "/upload",
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    String fileUpload(@RequestPart("file") MultipartFile file);


}
