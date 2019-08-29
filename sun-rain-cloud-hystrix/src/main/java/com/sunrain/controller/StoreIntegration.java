package com.sunrain.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @author admin
 */
@RestController
public class StoreIntegration {

    @GetMapping(value = "/getStores")
    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(HttpServletRequest request) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

    public Object defaultStores(HttpServletRequest request) {
        return "error";
    }


}
