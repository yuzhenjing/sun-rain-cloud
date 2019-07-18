package com.sunrain.controller;

import com.sunrain.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzz
 */
@RestController
public class HelloFeignController {


    @Autowired
    private HelloFeignService helloFeignService;


    @GetMapping(value = "/feign/demo/{repositories}")
    public String searchRepositories(@PathVariable String repositories) {
        ResponseEntity<byte[]> entity = helloFeignService.searchRepositories(repositories);
        return new String(entity.getBody());
    }


}
