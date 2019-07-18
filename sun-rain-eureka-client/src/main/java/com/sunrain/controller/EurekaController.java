package com.sunrain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class EurekaController {


    @GetMapping("/sayHello")
    public String sayHello() {
        return "我是提供者";
    }
}
