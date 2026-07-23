package com.example.microservices.model;

public class Loan {
    private String loanId;
    private double amount;

    public Loan(String loanId, double amount) {
        this.loanId = loanId;
        this.amount = amount;
    }

    public String getLoanId() { return loanId; }
    public double getAmount() { return amount; }
}
