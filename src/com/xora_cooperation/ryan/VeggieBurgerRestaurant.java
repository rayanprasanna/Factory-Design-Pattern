package com.xora_cooperation.ryan;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    protected Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }
}
