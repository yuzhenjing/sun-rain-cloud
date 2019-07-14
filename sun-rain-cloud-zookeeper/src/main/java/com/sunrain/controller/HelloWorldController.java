package com.sunrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yzz
 */
@RestController
public class HelloWorldController {

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/hallowed")
    public Map<String, Object> HelloWorld() {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "小雨点");
        return hashMap;
    }

    @GetMapping(value = "/services")
    public List<String> getAllServices() {
        return discoveryClient.getServices();
    }


}