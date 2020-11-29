package com.kodilla.inheritance.homework;

public class Teacher extends Job {


    public Teacher(String firstName, String job, int age) {
        super(4000, "uczy dzieci w wieku 12-18 lat");
    }
    @Override
    public void writeResponsibilities() {
        System.out.println(getResponsibilities());

    }
}
