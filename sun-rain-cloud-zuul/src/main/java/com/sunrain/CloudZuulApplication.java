package com.sunrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author admin
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class CloudZuulApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudZuulApplication.class, args);

    }

}
