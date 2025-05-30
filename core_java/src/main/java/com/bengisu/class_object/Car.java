package com.bengisu.class_object;

public class Car
{
    public String marka;
    public String model;
    public int sene;

    public Car(String marka,String model,int sene)
    {
        this.marka=marka;
        this.model=model;
        this.sene=sene;
    }
    public void print()
    {
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Yıl: "+sene);
    }
}
