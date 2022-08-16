package com.example.project02.services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class GymOperations {

    private int gymId;
    private String gymName;
    private double fitnessCost;
    private double poxingCost;
    private double maxDiscount;
    private ObservableList<Box> vipBoxes;

    public GymOperations(int gymId, String gymName, double fitnessCost, double poxingCost, double maxDiscount) {
        this.gymId = gymId;
        this.gymName = gymName;
        this.fitnessCost = fitnessCost;
        this.poxingCost = poxingCost;
        this.maxDiscount = maxDiscount;
        this.vipBoxes = FXCollections.observableArrayList();
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public double getFitnessCost() {
        return fitnessCost;
    }

    public void setFitnessCost(double fitnessCost) {
        this.fitnessCost = fitnessCost;
    }

    public double getPoxingCost() {
        return poxingCost;
    }

    public void setPoxingCost(double poxingCost) {
        this.poxingCost = poxingCost;
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public ObservableList<Box> getVipBoxes() {
        return vipBoxes;
    }

    public void setVipBoxes(ObservableList<Box> vipBoxes) {
        this.vipBoxes = vipBoxes;
    }


}
