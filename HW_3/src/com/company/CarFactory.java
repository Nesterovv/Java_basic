package com.company;

public class CarFactory {


 public static void getAllModels(){
    Model mercedes = Model.AMG;
    Model audi = Model.CLA;
    Model ford = Model.Escort;

    System.out.println(mercedes +" "+mercedes.getColor() +" "+ mercedes.getVolume() +" "+ mercedes.getWheel() );
     System.out.println(audi +" "+ audi.getColor() +" "+ audi.getVolume() +" "+ audi.getWheel());
     System.out.println(ford + " "+ford.getColor() +" "+ford.getVolume() +" "+ ford.getWheel());
}

}
