package com.sunrain.service;

import com.sunrain.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author admin
 * <p>
 * 方法调用出错时候友好的提示
 */
@Service
public class UserServiceFallBack implements UserService {
    @Override
    public String add(User user) {
        return "添加出错啦";
    }

    @Override
    public String update(User user) {
        return "更新出错啦";
    }
}
