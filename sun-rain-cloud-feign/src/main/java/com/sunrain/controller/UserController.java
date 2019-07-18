package com.sunrain.controller;

import com.sunrain.domain.User;
import com.sunrain.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */

@RestController
@RequestMapping("/user")
@Api(value = "UserController ")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscoveryClient discoveryClient;


    @ApiOperation(value = "添加用户")
    @PostMapping("/add")
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "json 数据") User user) {
        return userService.add(user);
    }


}
