package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FoodType;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, animals!");

        Human me = new Human("Dawid", "Szablowski");
        me.setSalary(3000.0);

        Human random1 = new Human("Jan", "Janowicz");
        random1.setSalary(2000.0);

        Animal dog = new Animal("canis","Szarik");

//        Animal dog = new Animal();
//        dog.species = "canis";
//        dog.alive = true;
//        dog.age = 7;
//        dog.weight = 24.0;
//        dog.name = "Burek";
        System.out.println(dog.name);
        System.out.println("doggo w " + dog.getWeight());
        dog.feed(3.0, FoodType.MEET);
        dog.feed(1.0, FoodType.ALL);
        dog.feed(2.0, FoodType.CROPS);
        System.out.println("doggo w " + dog.getWeight());


        System.out.println(me.getWeight());
        System.out.println(me.name);


        System.out.println("Moja wypłata: " + me.getSalary());

        Car mineCar = new Car("A6", "Audi", 2000.0, me);

        System.out.println(mineCar.owner.firstName + " " + mineCar.producer);

        me.setIsCarAffordable(mineCar);

        System.out.println(mineCar.owner.firstName + " " + me.car.model);

        //TASK 6
        System.out.println(new Car("A6", "Audi", 2000.0, me)
                .equals(new Car("A4", "Audi", 1000.0, me)));

        System.out.println(new Car("A6", "Audi", 2000.0, me)
                .equals(new Car("A6", "Audi", 2000.0, me)));

        System.out.println(me.firstName);

        //TASK 8
        Animal cat1 = new Animal("canis", "Kicia");

        mineCar.Sell(me, random1, 300.0);



        //TASK 1
        Phone nokia = new Phone();
        nokia.operationSystem = Phone.OperationSystem.WINDOWS_MOBILE;


        System.out.println(Country.POLAND.gdpInPLN());
        System.out.println(Country.POLAND.language);
        System.out.println(Country.POLAND.code);
    }

}
