package com.sunrain.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 */
@Configuration
public class RibbonConfig {


    @Bean
    @LoadBalanced //不加此注解 无法使用 注册中心中的地址进行请求
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @Bean
    public IRule rule() {
        //随机策略
        return new RandomRule();
    }

}
