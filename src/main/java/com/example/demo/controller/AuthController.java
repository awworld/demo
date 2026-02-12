package com.example.demo.controller;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. 告诉 Spring 这是一个专门处理 HTTP 请求的前台
@RequestMapping("/auth") // 2. 这里的地址前缀是 /auth
public class AuthController {

    @Autowired
    private UserService userService; // 注入刚才写的业务经理

    // 接口地址：POST /auth/register
    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        // @RequestBody 的作用：把 Postman 发来的 JSON 自动转成 RegisterRequest 对象

        userService.register(request); // 指挥 Service 干活

        return "注册成功！"; // 给 Postman 返回一句话
    }
}