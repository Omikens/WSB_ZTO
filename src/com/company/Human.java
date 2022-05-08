package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FoodType;
import com.company.devices.Car;

public class Human extends Animal {

    public String firstName;
    public String lastName;


    public Double cash;

    private double salary;
    private double animal;

    Car car;

    Human(String firstName, String lastName) {
        super("homo sapiens", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary(){
        System.out.println("(Zadanie 3 & 4:) " + "Pobrano informacje o Twojej wypłatcie: " + salary);
        return salary;
    }

    public void setSalary(double salary){
        if (salary >= 0){
            this.salary = salary;
            System.out.println("(Zadanie 3 & 4:) " + "Wysłano nowe dane dotyczace wypłaty: " + this.salary);
        }
        else {System.out.println("mniej niz zero");}
    }

    public void setIsCarAffordable(Car mineCar){
        if (this.salary > mineCar.price){
            this.car = mineCar;
        } else if (this.salary > mineCar.price/12){
            System.out.println("Na raty");
        }
        else {System.out.println("Nie stac na zakup");}
    }

    @Override
    public void feed(Animal animal, FoodType foodType) {

    }

    @Override
    public void feed(Animal foodWeight) {

    }
}
