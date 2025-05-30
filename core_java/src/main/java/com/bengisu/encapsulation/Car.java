package com.bengisu.encapsulation;

public class Car
{
    private String model;
    private String brand;
    private int year;

    public Car()
    {

    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void print()
    {
        System.out.println("Model: "+getModel());
        System.out.println("Marka: "+getBrand());
        System.out.println("Yıl: "+getYear());
    }
}
