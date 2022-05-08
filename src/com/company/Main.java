package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FoodType;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        System.out.println("(Zadanie 1) " + "Hello, animals!");

        Human me = new Human("Dawid", "Szablowski");
        me.setSalary(3000.0);

        Human random1 = new Human("Jan", "Janowicz");
        random1.setSalary(2000.0);

        System.out.println("Moja wypłata: " + me.getSalary());

        Animal dog = new Animal("canis", "Szarik") {
            @Override
            public void feed(Animal animal, FoodType foodType) {

            }

            @Override
            public void feed(Animal foodWeight) {

            }
        };

        System.out.println(dog.name);
        System.out.println("Sprawdzam wagę Psa przed karmieniem: " + dog.getWeight());
        dog.feed(3.0, FoodType.MEET);
        dog.feed(1.0, FoodType.ALL);
        dog.feed(2.0, FoodType.CROPS);
        System.out.println("Sprawdzam wagę Psa po karmieniu: " + dog.getWeight());


        System.out.println("Moja waga: "+me.getWeight());
        System.out.println("Moje Imie: "+me.name);

        Car mineCar = new Car("A6", "Audi", 2000.0, me);

        System.out.println("Właściciel auta: "+mineCar.owner.firstName + " Producent auta: " + mineCar.producer);

        me.setIsCarAffordable(mineCar);

        System.out.println(mineCar.owner.firstName + " " + me.car.model);

        //TASK 6
        System.out.println(new Car("A6", "Audi", 2000.0, me)
                .equals(new Car("A4", "Audi", 1000.0, me)));

        System.out.println(new Car("A6", "Audi", 2000.0, me)
                .equals(new Car("A6", "Audi", 2000.0, me)));

        System.out.println(me.firstName);

        //TASK 8
        Animal cat1 = new Animal("canis", "Kicia") {
            @Override
            public void feed(Animal animal, FoodType foodType) {

            }

            @Override
            public void feed(Animal foodWeight) {

            }
        };

        mineCar.Sell(me, random1, 300.0);

        //TASK 1
        Phone nokia = new Phone();
        nokia.operationSystem = Phone.OperationSystem.WINDOWS_MOBILE;


        System.out.println("GDP Polski: "+Country.POLAND.gdpInPLN());
        System.out.println("Jezyk: "+Country.POLAND.language);
        System.out.println("Code: "+Country.POLAND.code);

        mineCar.refuel();
    }

}
