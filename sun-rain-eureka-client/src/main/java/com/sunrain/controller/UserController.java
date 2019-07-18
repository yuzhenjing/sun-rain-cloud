package com.sunrain.controller;

import com.sunrain.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public User addUser(User user) {
        log.info("提供者受到参数：{}", user);
        return user;
    }

    @RequestMapping("/update")
    public User updateUser(@RequestBody User user) {
        log.info("修改用户 接收到参数：{}", user);
        return user;
    }


}
