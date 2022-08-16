package com.example.project02.services;

public class Box {

    private String boxName;
    private double boxCost;

    public Box(String boxName, double boxCost) {
        this.boxName = boxName;
        this.boxCost = boxCost;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public double getBoxCost() {
        return boxCost;
    }

    public void setBoxCost(double boxCost) {
        this.boxCost = boxCost;
    }

    @Override
    public String toString() {
        return "Box: " + boxName + " Cost: " + boxCost;
    }
}
