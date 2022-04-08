package com.company.devices;

public abstract class Device {

    //TASK 7
    public String model;
    public String producer;
    public int year;


    abstract public void turnOn();


    public String toString(){//overriding the toString() method
        return model+" "+producer+" "+year;
    }


}
