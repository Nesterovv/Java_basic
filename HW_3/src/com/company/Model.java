package com.company;

public enum Model {
    AMG("Black", 2.0, 18), CLA("Blue", 3.0, 17), Escort("Yellow", 1.6, 16);

    private String color;

    private double volume;

    private int wheel;


    Model(String color, double volume, int wheel){
        this.color = color;
        this.volume = volume;
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    public int getWheel() {
        return wheel;
    }
}
