package com.sunrain.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author admin
 * 测试
 */
@FeignClient(value = "helloProvider")
public interface HelloFacade {

    /**
     * 测试
     *
     * @param value
     * @return
     */
    @GetMapping(value = "/hello")
    String hello(String value);
}
