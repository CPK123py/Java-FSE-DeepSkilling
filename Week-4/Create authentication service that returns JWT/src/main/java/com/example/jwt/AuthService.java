package com.example.jwt;

public class AuthService {
    public String authenticate(String username, String password) {
        if ("user".equals(username) && "password".equals(password)) {
            return JwtUtil.generateToken(username);
        }
        throw new IllegalArgumentException("Invalid credentials");
    }
}
