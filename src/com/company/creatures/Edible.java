package com.company.creatures;

import com.company.Human;

public interface Edible {

    public abstract void beEaten(Human seller, Human buyer, Double price);
}
