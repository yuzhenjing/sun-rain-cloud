package com.sunrain.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author admin
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 由于spring-boot-starter-security 默认开启了 csrf 认证
     * 但是这对于 客户端这种没有页面的操作是极其不方便的
     * 而security  又没有对应的配置进行关闭
     * 所以在这里进行自定义关闭
     *
     * @param httpSecurity
     * @throws Exception
     */

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        super.configure(httpSecurity);
        httpSecurity.csrf().disable();
    }
}
