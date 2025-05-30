package com.bengisu.overloading;

public class Calculator
{
    public int add(int a,int b)
    {
        return a + b;
    }
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }
    public void Hesapla()
    {
        System.out.println(add(3,7));
        System.out.println(add(2,8,27));
    }
}
