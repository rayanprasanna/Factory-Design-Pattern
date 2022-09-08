package com.xora_cooperation.ryan;

public abstract class Restaurant {
    Burger burger;
    public void orderBurger(){
        System.out.println("Ordering Burger...");
        burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger();
}
