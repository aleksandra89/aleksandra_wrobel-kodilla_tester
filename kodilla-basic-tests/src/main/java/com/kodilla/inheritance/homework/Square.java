package com.kodilla.inheritance.homework;

public class Square extends Shape {

    public Square() {
        super (5, 5, 0);
    }

    @Override
    public void caculateArea() {

        int area = getA()*getB();
        System.out.println("Pole kwadratu wynosi: " + area);
    }

    @Override
    public void calculateCircumference() {
        int circumference = getA()+getA()+getB()+getB();
        System.out.println("Obwód kwadratu wynosi:" + circumference);

    }
}
