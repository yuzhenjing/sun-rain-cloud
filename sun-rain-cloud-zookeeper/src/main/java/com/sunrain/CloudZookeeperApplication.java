package com.sunrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yzz
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZookeeperApplication.class, args);
    }

}
