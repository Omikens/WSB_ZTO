package com.company.devices;

import com.company.Human;

import java.lang.reflect.Array;

public class Car extends Device{

    public String model;
    public String producer;

    public double price;

    public Human owner;


    public Car(String model, String producer, double price, Human owner){
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.owner = owner;
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("widzę jabłko");
    }

    //TASK 6
    public String toString(){//overriding the toString() method
        return model+" "+producer+" "+price+" "+owner;
    }
}
