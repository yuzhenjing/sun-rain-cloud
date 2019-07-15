package com.sunrain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author admin
 */
@Configuration
public class RestConfig {


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
