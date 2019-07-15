package com.sunrain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author admin
 */
@RestController
public class EurekaController {

    
    @GetMapping(value = "/getMap")
    public Map<String, Object> getMap() {
        final Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "小雨点");
        hashMap.put("birthday", "2019-10-17");
        return hashMap;
    }


}
