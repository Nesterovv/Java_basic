package com.company;

import java.util.ArrayList;

public class ServiceCar {
    private String color;
    private Double wheel;
    ArrayList<String> cars = new ArrayList<String>();
    private int removeElement;

    public void changeColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void changeWheel(Double wheel) {
        this.wheel = wheel;
    }

    public Double getWheel() {
        return wheel;
    }
    public void addOption (String options){
        cars.add(options);
        System.out.println(cars);

    }
    public void removeOption (int removeElement){
        int index = cars.size()-1;
        cars.remove(index);
        System.out.println(cars);

    }

}
