package com.kodilla.abstracts;

public class Rectangle extends Shape {

    public Rectangle() {
        super(6, 8, 0);

    }

    @Override
    public void caculateArea() {
        int area = getA()*getB();
        System.out.println("Pole prostokąta wynosi: " + area);

    }

    @Override
    public void calculateCircumference() {
        int circumference = getA()+getB()+getB()+getA();
        System.out.println("obwód prostokąta wynosi: " + circumference);

    }
}
