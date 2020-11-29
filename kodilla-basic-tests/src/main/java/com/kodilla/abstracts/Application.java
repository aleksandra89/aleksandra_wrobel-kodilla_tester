package com.kodilla.abstracts;

import com.kodilla.inheritance.homework.Rectangle;
import com.kodilla.inheritance.homework.Square;
import com.kodilla.inheritance.homework.Trapeze;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();

        // zadanie 3.2

        Square square = new Square();
        square.caculateArea();
        square.calculateCircumference();

        Rectangle rectangle = new Rectangle();
        rectangle.caculateArea();
        rectangle.calculateCircumference();

        Trapeze trapeze = new Trapeze();
        trapeze.caculateArea();
        trapeze.calculateCircumference();

    }
}
