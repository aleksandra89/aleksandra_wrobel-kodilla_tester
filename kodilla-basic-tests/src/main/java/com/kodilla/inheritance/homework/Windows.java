
package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows() {
        super(2005);
    }
    @Override
    public void turnOn (){

        System.out.println("system jest obecny od " + getYear());
    }
    public void turnOff () {
        System.out.println("system został zamknięty");
    }
}

