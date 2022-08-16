package com.example.project02.services;

public class Sallery {

    private int salleryId;
    private double monthCosts;
    private double discount;
    private double loan;
    private String month;

    public Sallery(int salleryId, double monthCosts, double discount, double loan, String month) {
        this.salleryId = salleryId;
        this.monthCosts = monthCosts;
        this.discount = discount;
        this.loan = loan;
        this.month = month;
    }

    public Sallery(double monthCosts, double discount, double loan, String month) {
        this.monthCosts = monthCosts;
        this.discount = discount;
        this.loan = loan;
        this.month = month;
    }

    public int getSalleryId() {
        return salleryId;
    }

    public void setSalleryId(int salleryId) {
        this.salleryId = salleryId;
    }

    public double getMonthCosts() {
        return monthCosts;
    }

    public void setMonthCosts(double monthCosts) {
        this.monthCosts = monthCosts;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Sallery{" +
                "salleryId=" + salleryId +
                ", monthCosts=" + monthCosts +
                ", discount=" + discount +
                ", loan=" + loan +
                ", month='" + month + '\'' +
                '}';
    }
}
