package com.example.demo.dto;

public class RegisterRequest {
    private String username;
    private String password;

    // 必写的 Getter 和 Setter (可以用 Alt+Insert 快捷键生成)
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}