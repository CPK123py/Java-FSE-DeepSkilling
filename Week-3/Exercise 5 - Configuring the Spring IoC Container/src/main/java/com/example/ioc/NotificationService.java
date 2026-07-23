package com.example.ioc;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendMessage(String message) {
        System.out.println("Notification: " + message);
    }
}
