package com.example.microservices.controller;

import com.example.microservices.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/account")
    public Account getAccount() {
        return new Account("ACC12345", 4500.00);
    }
}
