package com.bengisu.overriding;

public class Car extends Vehicle
{
    @Override
    public void Start() {
        System.out.println("Araba 120km hızla yola çıkıyor...");
    }
}
