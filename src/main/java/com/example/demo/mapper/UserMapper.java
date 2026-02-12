package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    // 👇 关键！这里只要留这一行干干净净的方法定义！
    // ❌ 绝对不要留 @Insert("INSERT INTO ...") 这种东西！删掉它！
    void insert(User user);

}