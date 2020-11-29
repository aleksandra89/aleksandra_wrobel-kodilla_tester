package com.kodilla.inheritance.homework;

public class Actor extends Job {


    public Actor(String firstName, String job, int age) {
        super(10000, "gra w reklamie proszku do prania");
    }

    @Override
    public void writeResponsibilities() {
        System.out.println(getResponsibilities());

    }
}
