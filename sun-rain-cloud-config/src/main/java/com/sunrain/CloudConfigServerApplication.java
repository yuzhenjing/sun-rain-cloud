package com.sunrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 服务注册于发现
 */
@EnableConfigServer
@SpringBootApplication
public class CloudConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }

    @Bean
    public EnvironmentRepository environmentRepository() {
        return (application, profile, label) -> {

            Environment environment = new Environment("default", profile);

            Map<String, Object> source = new HashMap<>();
            source.put("master", "小雨点");
            source.put("sun", "小太阳");
            PropertySource propertySource = new PropertySource("map", source);
            List<PropertySource> propertySources = environment.getPropertySources();
            propertySources.add(propertySource);

            return environment;
        };
    }
}
