package com.geometry;

public abstract class Circle {
    private String color;
    private double  raidus;
    public Circle(double raidus){
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
