package com.sunrain;

import com.sunrain.filter.CustomeGatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author admin
 * 网关
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GateWayApplication {


    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);

    }

    @Bean
    public RouteLocator customRooteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/jd")
                        .filters(f -> f.filter(new CustomeGatewayFilter()))
                        .uri("https://www.jd.com/")
                        .id("jd_route"))

                .route(r -> r.path("/baidu")
                        .uri("https://www.baidu.com/")
                        .id("baidu_route"))
                .build();
    }
}
