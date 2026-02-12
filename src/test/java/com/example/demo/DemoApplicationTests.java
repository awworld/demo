package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class StudyHubApplicationTests {

    // 1. 注入我们刚才写的“服务员” (UserMapper)
    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        System.out.println("🎬 开始测试插入数据...");

        // 2. 创建一个新用户对象 (准备菜品)
        User user = new User();
        user.setUsername("java_tester");  // 用户名
        user.setPassword("666666");       // 密码
        user.setCreateTime(LocalDateTime.now()); // 当前时间

        // 3. 让服务员下单 (调用 insert 方法)
        userMapper.insert(user);

        System.out.println("✅ 写入命令已发送！请去数据库检查！");
    }
}