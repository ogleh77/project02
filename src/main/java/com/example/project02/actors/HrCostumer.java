package com.example.project02.actors;

public class HrCostumer {
    private int tempId;
    private String firstName;
    private String lasttName;
    private String phone;
    private String gender;
    private double paid;
    private String paidBy;
    private boolean poxing;
    private String timeJoined;
    private String expTime;

    public HrCostumer(int tempId, String firstName, String lasttName, String phone, String gender, double paid, String paidBy, boolean poxing, String timeJoined, String expTime) {
        this.tempId = tempId;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.phone = phone;
        this.gender = gender;
        this.paid = paid;
        this.paidBy = paidBy;
        this.poxing = poxing;
        this.timeJoined = timeJoined;
        this.expTime = expTime;
    }

    public HrCostumer(String firstName, String lasttName, String phone, String gender, double paid, String paidBy, boolean poxing) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.phone = phone;
        this.gender = gender;
        this.paid = paid;
        this.paidBy = paidBy;
        this.poxing = poxing;
    }

    public int getTempId() {
        return tempId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public double getPaid() {
        return paid;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public boolean isPoxing() {
        return poxing;
    }

    public String getTimeJoined() {
        return timeJoined;
    }

    public String getExpTime() {
        return expTime;
    }

    @Override
    public String toString() {
        return "HrCostumer{" +
                "tempId=" + tempId +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", paid=" + paid +
                ", paidBy='" + paidBy + '\'' +
                ", poxing=" + poxing +
                ", timeJoined='" + timeJoined + '\'' +
                ", expTime='" + expTime + '\'' +
                '}';
    }
}
