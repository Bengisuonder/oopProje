package com.bengisu.this_super;

public class Person
{
    String isim;
    int yas;

    public Person(String isim,int yas)
    {
        this.isim = isim;
        this.yas = yas;
    }
    public void Cikti()
    {
        System.out.println("İsim: "+ isim +", Yaş: "+yas);
    }
}
