package com.company;

import java.util.ArrayList;

public class Car {
    private String color;
    final String model;
    final int year;
    private Double wheel;
    final Double engineVolume;
   ArrayList<String> cars = new ArrayList<String>();


    public Car(String model, int year, Double engineVolume) {
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
    }

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
    public void removeOption (String removeElement){
        cars.remove(removeElement);
        System.out.println(cars);

    }
    }

