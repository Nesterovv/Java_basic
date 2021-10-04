package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Mazda", 1989, 2.0);
        CarFactory carFactory = new CarFactory();
        System.out.println(car.model +" " + car.year + " " +car.engineVolume);
        car.changeColor("Blue");
        car.changeColor("Red");
        System.out.println(car.getColor());
        car.changeWheel(21.0);
        System.out.println(car.getWheel());
        car.addOption("diffs");
        car.addOption("diffsww");
        car.addOption("diffsww324");
        car.addOption("diffsww324");
        car.removeOption("diffsww");
        carFactory.getAllModels();
    }
}
