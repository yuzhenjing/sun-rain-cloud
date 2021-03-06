package com.sunrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author admin
 */
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class CloudHystrixApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudHystrixApplication.class, args);


    }


}
