package com.example.jwt;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;

public class JwtUtil {
    public static String generateToken(String username) {
        String header = Base64.getUrlEncoder().withoutPadding().encodeToString("{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes(StandardCharsets.UTF_8));
        String payload = Base64.getUrlEncoder().withoutPadding().encodeToString(("{\"sub\":\"" + username + "\",\"iat\":\"" + Instant.now().getEpochSecond() + "\"}").getBytes(StandardCharsets.UTF_8));
        String signature = Base64.getUrlEncoder().withoutPadding().encodeToString("secret".getBytes(StandardCharsets.UTF_8));
        return header + "." + payload + "." + signature;
    }
}
