package com.example.demo.entity;

import java.time.LocalDateTime;

public class User {
    // 对应数据库的 id (BIGINT)
    private Long id;
    // 对应数据库的 username (VARCHAR)
    private String username;
    // 对应数据库的 password (VARCHAR)
    private String password;
    // 对应数据库的 create_time (DATETIME)
    private LocalDateTime createTime;

    // --- 下面是 Getter 和 Setter 方法 (这是 Java 的规矩) ---
    // 你可以用 IDEA 快捷键生成：右键 -> Generate -> Getter and Setter -> 全选 -> OK

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public LocalDateTime getCreateTime() { return createTime; }
    public void setCreateTime(LocalDateTime createTime) { this.createTime = createTime; }
}