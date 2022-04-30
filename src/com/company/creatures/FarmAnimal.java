package com.company.creatures;

import com.company.Human;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String species, String name) {
        super(species, name);
    }

    @Override
    public void beEaten(Human seller, Human buyer, Double price) {

    }

    @Override
    public void feed(Animal animal, FoodType foodType) {

    }

    @Override
    public void feed(Animal foodWeight) {

    }
}
