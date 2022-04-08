package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, animals!");

        Animal dog = new Animal("canis","Szarik");

//        Animal dog = new Animal();
//        dog.species = "canis";
//        dog.alive = true;
//        dog.age = 7;
//        dog.weight = 24.0;
//        dog.name = "Burek";
        System.out.println(dog.name);
        System.out.println("doggo w " + dog.getWeight());
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println("doggo w " + dog.getWeight());

        Human me = new Human("Dawid", "Szablowski");
        System.out.println(me.getWeight());
        System.out.println(me.name);

        me.setSalary(3000.0);
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

        System.out.println(mineCar);

    }

}
