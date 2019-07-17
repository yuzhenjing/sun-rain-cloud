package com.sunrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author admin
 */
@EnableCircuitBreaker
@SpringBootApplication
public class CloudHystrixApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudHystrixApplication.class, args);


    }


}
