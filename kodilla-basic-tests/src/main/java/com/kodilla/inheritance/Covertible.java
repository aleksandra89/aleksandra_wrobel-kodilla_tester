package com.kodilla.inheritance;

public class Covertible extends Car {

    public Covertible(int wheels, int seats) {
        super(wheels, seats);
        System.out.println("Covertible constructor");
    }
    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }
    @Override // nadpisywanie metody z glownej klasy car
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }

}
