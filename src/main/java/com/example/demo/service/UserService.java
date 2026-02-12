package com.example.demo.service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service // 1. 必须加这个！告诉 Spring 这是一个业务经理
public class UserService {

    @Autowired
    private UserMapper userMapper; // 2. 注入队友写的 Mapper

    // 注册逻辑
    public void register(RegisterRequest request) {
        // 3. 把 DTO 转成 Entity (前端只传了用户名密码，我们得补上其他信息)
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setCreateTime(LocalDateTime.now()); // 补上注册时间

        // 4. 调用队友的代码写入数据库
        userMapper.insert(user);
    }
}