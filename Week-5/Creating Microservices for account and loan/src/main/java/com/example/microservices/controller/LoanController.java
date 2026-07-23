package com.example.microservices.controller;

import com.example.microservices.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping("/loan")
    public Loan getLoan() {
        return new Loan("LN98765", 12000.00);
    }
}
