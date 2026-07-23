package com.example.jwt;

public class JwtAuthApplication {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        String token = authService.authenticate("user", "password");
        System.out.println("Generated JWT: " + token);
    }
}
