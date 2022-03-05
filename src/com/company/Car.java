package com.company;

import java.lang.reflect.Array;

public class Car {

    String model;
    String producer;

    double price;

    Human owner;


    Car(String model, String producer, double price, Human owner){
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.owner = owner;
    }
}
