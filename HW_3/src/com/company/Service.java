package com.company;

import java.util.ArrayList;

public class Service extends Autosalon {
   private String color;
    private Double wheel;
    ArrayList<String> carOptions = new ArrayList<String>();

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
        carOptions.add(options);
        System.out.println(carOptions);

    }
    public void removeOption (String removeElement){
        carOptions.remove(removeElement);
        System.out.println(carOptions);

    }

}
