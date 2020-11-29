package com.kodilla.inheritance.homework;

public class Driver extends Job {

    public Driver(String firstName, String job, int age) {
        super(5000, "przewóz osób z Warszawy do Olsztyna");
    }

    @Override
    public void writeResponsibilities() {
        System.out.println(getResponsibilities());

    }
}
