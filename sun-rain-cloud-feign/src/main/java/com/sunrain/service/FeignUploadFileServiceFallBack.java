package com.sunrain.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author admin
 * <p>
 * 上传失败友好返回
 */
@Service
public class FeignUploadFileServiceFallBack implements FeignUploadFileService {
    @Override
    public String fileUpload(MultipartFile file) {
        return "文件上传出错";
    }
}
