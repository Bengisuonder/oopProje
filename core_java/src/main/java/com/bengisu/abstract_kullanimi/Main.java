package com.bengisu.abstract_kullanimi;

public class Main
{
    public static void main(String[]args)
    {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}
