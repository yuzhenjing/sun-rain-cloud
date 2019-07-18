package com.sunrain.intercept;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author admin
 */
@Component
public class FeignRequestInterceptor implements RequestInterceptor {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void apply(RequestTemplate template) {
        //feign 不支持get方法传递POJO json body转query
        if (template.method().equals(Request.HttpMethod.GET.name())) {
            template.queries(template.queries());
            template.body(Request.Body.empty());
        }
    }

    /**
     * 说明
     *   Feign 的post 和get 多参数传递
     *   在实际项目开发中 我们使用Feign 实现服务之间的调用
     *   但是在很多情况下 多参数的传递是不可避免的
     *   那么在GET 和 POST的情况下使用feign 如何进行参数传递呢
     *
     *   在普通的Spring MVC开发中 是支持GET方法直接绑定POJO的
     *   但是在Feign 的实现 并没有覆盖Spring Mvc的全部功能，目前针对Feign zhong
     *   进行GET或者是POST 多参数传递的解决方法试试
     *   1 把POJO拆散成一个一个单独的实行放在方法参数里
     *   2 把方法参数变成Map传递
     *   3 使用GET传递@RequestBody 但是此方法违反了RestFul规范
     *
     *   以上方法 都能够实现多参数传递，但时相对繁琐
     *   下面介绍一种最佳实践方式，通过Feign拦截器的方式处理
     *    通过实现Feign 的RequestInterceptor中的apply方法进行统一拦截
     *    转换Feign zhong GET方法参数传递的问题，而Feign进行post多参数传递比GETduo
     *    参数传递简单  
     *
     *
     */


}
