package com.example.project02.actors;

import com.jfoenix.controls.JFXButton;

public class Costumers {
    private int costumerId;
    private String firstName;
    private String lastName;
    private String phone;
    private String gender;
    private String shift;
    private double paid;
    private double discount;
    private String paidBy;
    private String image;
    private boolean poxing;
    private String whoAdded;
    private String dateJoined;
    private String expDate;
    private JFXButton infoBtn;
    private JFXButton editBtn;

    public Costumers(int costumerId, String firstName, String lastName, String phone, String gender, String shift, double paid, double discount, String paidBy, String image, boolean poxing, String whoAdded, String dateJoined, String expDate) {
        this.costumerId = costumerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.shift = shift;
        this.paid = paid;
        this.discount = discount;
        this.paidBy = paidBy;
        this.image = image;
        this.poxing = poxing;
        this.whoAdded = whoAdded;
        this.dateJoined = dateJoined;
        this.expDate = expDate;
        this.infoBtn = new JFXButton("Delete");
        this.editBtn = new JFXButton("Edit");
        this.infoBtn.setStyle("-fx-background-color: red;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
        this.editBtn.setStyle("-fx-background-color: dodgerblue;-fx-font-size: 12;-fx-font-family: 'Arial Black';-fx-text-fill: white");
    }

    public Costumers(String firstName, String lastName, String phone, String gender, String shift, double paid, double discount, String paidBy, String image, boolean poxing, String whoAdded) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.shift = shift;
        this.paid = paid;
        this.discount = discount;
        this.paidBy = paidBy;
        this.image = image;
        this.poxing = poxing;
        this.whoAdded = whoAdded;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getShift() {
        return shift;
    }

    public double getPaid() {
        return paid;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public String getImage() {
        return image;
    }

    public boolean isPoxing() {
        return poxing;
    }

    public String getWhoAdded() {
        return whoAdded;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public String getExpDate() {
        return expDate;
    }

    public JFXButton getInfoBtn() {
        return infoBtn;
    }

    public JFXButton getEditBtn() {
        return editBtn;
    }

    @Override
    public String toString() {
        return String.format("%s %s %S", firstName, lastName, phone);
    }
}
