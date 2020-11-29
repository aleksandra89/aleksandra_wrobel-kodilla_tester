
package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{

    public Linux() {
        super(1990);
    }
    @Override
    public void turnOn () {
        System.out.println("system jest obecny od " + getYear());

    }
    public void turnOff() {
        System.out.println("system jest niepotrzebny");
    }
}

