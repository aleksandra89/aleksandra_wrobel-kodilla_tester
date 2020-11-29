package com.kodilla.inheritance.homework;

public class Person {
    public static void main(String[] args) {

        String firstName;
        int age;
        String job;

        Teacher teacher = new Teacher("Magdalena", "nauczycielka", 45);
        teacher.writeResponsibilities();

        Driver driver = new Driver("Marek", "kierowca", 30);
        driver.writeResponsibilities();

        Actor actor = new Actor("Anna", "aktorka", 25);
        actor.writeResponsibilities();


    }
}
