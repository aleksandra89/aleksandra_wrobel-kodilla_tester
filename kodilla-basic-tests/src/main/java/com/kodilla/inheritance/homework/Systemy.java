package com.kodilla.inheritance.homework;

public class Systemy {
    public static void main(String[] args) {

        Windows windows = new Windows();
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux();
        linux.turnOn();
        linux.turnOff();

    }
}
