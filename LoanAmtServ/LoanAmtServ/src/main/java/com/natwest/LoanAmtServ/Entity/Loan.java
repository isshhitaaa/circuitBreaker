package com.natwest.LoanAmtServ.Entity;

public class Loan {
    Integer id;
    String type;
    Double amount;
    Double interest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Loan() {
    }

    public Loan(Integer id, String type, Double amount, Double interest) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.interest = interest;
    }
}
