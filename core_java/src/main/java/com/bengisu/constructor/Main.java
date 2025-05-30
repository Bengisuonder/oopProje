package com.bengisu.constructor;

public class Main
{
    public static void main(String[]args)
    {
        Car car = new Car("Volkswagen","Beetle",1974);

        System.out.println("Arabanın markası: " + car.marka + ", Modeli: " + car.model + ", Yılı: " + car.sene);
    }
}
