package com.company;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten(Human seller, Human buyer, Double price) {

    }
}
