package com.example.project02.services;

public class Loan {
    private String gaveName;
    private String takerName;
    private String phone;
    private double amount;
    private String takeBy;
    private String loanDate;

    public Loan(String gaveName, String takerName, String phone, double amount, String takeBy, String loaDate) {
        this.gaveName = gaveName;
        this.takerName = takerName;
        this.phone = phone;
        this.amount = amount;
        this.takeBy = takeBy;
        this.loanDate = loaDate;
    }

    public Loan(String gaveName, String takerName, String phone, double amount, String takeBy) {
        this.gaveName = gaveName;
        this.takerName = takerName;
        this.phone = phone;
        this.amount = amount;
        this.takeBy = takeBy;
    }

    public String getGaveName() {
        return gaveName;
    }

    public void setGaveName(String gaveName) {
        this.gaveName = gaveName;
    }

    public String getTakerName() {
        return takerName;
    }

    public void setTakerName(String takerName) {
        this.takerName = takerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTakeBy() {
        return takeBy;
    }

    public void setTakeBy(String takeBy) {
        this.takeBy = takeBy;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "gaveName='" + gaveName + '\'' +
                ", takerName='" + takerName + '\'' +
                ", phone='" + phone + '\'' +
                ", amount=" + amount +
                ", takeBy='" + takeBy + '\'' +
                ", loanDate='" + loanDate + '\'' +
                '}';
    }
}
