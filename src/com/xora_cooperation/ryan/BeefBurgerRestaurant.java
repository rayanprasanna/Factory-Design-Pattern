package com.xora_cooperation.ryan;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    protected Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }
}
