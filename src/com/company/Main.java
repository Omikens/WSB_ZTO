package com.company;

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

        Car mineCar = new Car("A6", "Audi", 2000.0, me);

        System.out.println(mineCar.owner.firstName + " " + mineCar.producer);
    }
}
