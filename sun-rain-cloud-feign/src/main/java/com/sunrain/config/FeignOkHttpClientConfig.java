package com.sunrain.config;

import feign.Feign;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author admin
 */
@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureBefore(FeignAutoConfiguration.class)
public class FeignOkHttpClientConfig {


    @Bean
    public OkHttpClient okHttpClient() {

        return new OkHttpClient.Builder()
                //设置连接超时
                .connectTimeout(2, TimeUnit.SECONDS)
                //设置读超时
                .readTimeout(2, TimeUnit.SECONDS)
                //设置写超时
                .writeTimeout(60, TimeUnit.SECONDS)
                //设置超时重连
                .retryOnConnectionFailure(true)
                //设置连接线程池
                .connectionPool(new ConnectionPool())
                //构建 OkHttpClient
                .build();


    }


}
