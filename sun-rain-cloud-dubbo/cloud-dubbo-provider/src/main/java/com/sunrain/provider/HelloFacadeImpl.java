package com.sunrain.provider;

import com.sunrain.api.HelloFacade;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * 实现类
 */
@Service
@RestController
public class HelloFacadeImpl implements HelloFacade {

    @Override
    public String hello(String value) {
        return "hello " + value;
    }
}
