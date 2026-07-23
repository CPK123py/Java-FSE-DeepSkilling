package com.example.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            UserService userService = context.getBean(UserService.class);
            userService.registerUser("alice");
        }
    }
}
