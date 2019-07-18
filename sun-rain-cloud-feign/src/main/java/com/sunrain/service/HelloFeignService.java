package com.sunrain.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yzz
 */
@FeignClient(name = "github-client", url = "https://api.github.com")
public interface HelloFeignService {

    /**
     * feign 测试
     *
     * @param qStr
     * @return
     */
    @RequestMapping(value = "/search/repositories")
    ResponseEntity<byte[]> searchRepositories(@RequestParam("q") String qStr);
}
