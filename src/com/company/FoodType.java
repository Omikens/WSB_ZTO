package com.company;

public enum FoodType {
    MEET(0.7),
    CROPS(0.3),
    ALL(0.5);

    final Double foodBodyRatio;

    FoodType(Double foodBodyRatio){
        this.foodBodyRatio = foodBodyRatio;
    }
}
