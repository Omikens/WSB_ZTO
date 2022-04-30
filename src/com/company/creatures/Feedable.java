package com.company.creatures;

import com.company.Human;

public interface Feedable {
    public abstract void feed(Animal animal, FoodType foodType);

    public abstract void feed(Animal foodWeight);
}
