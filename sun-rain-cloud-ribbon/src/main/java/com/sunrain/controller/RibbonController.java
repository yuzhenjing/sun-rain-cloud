package com.sunrain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * 服务注册与发现从测试
 *
 * @author admin
 */
@RestController
public class RibbonController {


    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/test")
    public Map<String, Object> test() {
        return (Map<String, Object>) restTemplate.getForEntity("http://eureka-client-1/getMap", Map.class);
    }

    @GetMapping(value = "/getInstances")
    public List<ServiceInstance> getServiceList(@RequestParam(defaultValue = "eureka-server-1") String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }

}
