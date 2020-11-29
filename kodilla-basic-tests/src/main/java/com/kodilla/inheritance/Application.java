package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();

        Covertible covertible = new Covertible(4,2);
        covertible.displayNumberOfSeats();
        covertible.closeRoof();
        System.out.println(covertible.getSeats());







    }
}
