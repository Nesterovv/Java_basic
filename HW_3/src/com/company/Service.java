package com.company;

public abstract class Service {
    public static void main(String[] args) {
        ServiceCar serviceCar = new ServiceCar();
        serviceCar.changeWheel(21.0);
        System.out.println(serviceCar.getWheel());
        Autosalon service = new Autosalon();
        service.changeWheel(19.0);
        System.out.println(service.getWheel());

    }


}
