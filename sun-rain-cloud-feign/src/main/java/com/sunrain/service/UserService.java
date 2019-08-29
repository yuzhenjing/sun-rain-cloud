package com.sunrain.service;

import com.sunrain.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author admin
 */
@FeignClient(name = "EUREKA-CLIENT-2",fallback = UserServiceFallBack.class)
public interface UserService {

    /**
     * 添加用户 测试 get多参数请求
     *
     * @param user
     * @return
     */
    @GetMapping("/user/add")
    String add(User user);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @PostMapping("/user/update")
    String update(@RequestBody User user);


}
