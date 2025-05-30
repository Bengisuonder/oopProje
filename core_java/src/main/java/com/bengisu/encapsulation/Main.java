package com.bengisu.encapsulation;

public class Main
{
    public static void main(String[]args)
    {
        Car car=new Car();
        car.setBrand("Volkswagen");
        car.setModel("Beetle");
        car.setYear(1974);

        car.print();
    }
}
