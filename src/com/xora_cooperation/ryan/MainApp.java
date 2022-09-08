package com.xora_cooperation.ryan;

public class MainApp {
    public static void main(String[] args){
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();
    }
}
