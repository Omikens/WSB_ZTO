package com.company.creatures;

import com.company.Human;

public abstract class Animal implements Salleable, Feedable {

    private static final Double DEFAULT_COW_WEIGHT = 5.0;

    private static final Double DEFAULT_DOG_WEIGHT = 2.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 0.5;
    final String species;
    public String name;
    Integer age;
    private Double weight;
    public final FoodType foodType;

    private Boolean alive;

    public Animal(String species, String name){
        this.alive = true;
        this.species = species;
        this.name = name;

        if (species.equals("canis")) {
            this.foodType = FoodType.ALL;
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("felis")) {
            this.foodType = FoodType.MEET;
            this.weight = DEFAULT_CAT_WEIGHT;
        }    else if (species.equals("cow")) {
            this.foodType = FoodType.CROPS;
            this.weight = DEFAULT_COW_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
            this.foodType = FoodType.ALL;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    public void feed(Double foodWeight, FoodType foodType){
        switch (foodType){
            case ALL: this.weight += FoodType.ALL.foodBodyRatio * foodWeight; break;
            case MEET: this.weight += FoodType.MEET.foodBodyRatio * foodWeight; break;
            case CROPS: this.weight += FoodType.CROPS.foodBodyRatio * foodWeight; break;
        }
        System.out.println("thx for food");
    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) {
        System.out.println("Czy seller ma zwierzaka?: " + seller.getSalary());
    }
}
