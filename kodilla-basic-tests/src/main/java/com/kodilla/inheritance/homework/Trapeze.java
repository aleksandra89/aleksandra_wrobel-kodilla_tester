package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.homework.Shape;

public class Trapeze extends Shape {

    int a;
    int b;
    int c;
    int h;
    int d;

    Trapeze trapeze = new Trapeze(4, 6, 7, 3);



    public Trapeze(int a, int b, int h, int d) {
        trapeze.caculateArea();
        trapeze.calculateCircumference();


    }

    @Override
    public void caculateArea() {
        double area = (double) (a+b)*h/2;
        System.out.println("Pole trapezu wynosi: " + area);

    }

    @Override
    public void calculateCircumference() {
        int circumference = a+b+c+d;
        System.out.println("Obwód trapezu wynosi: "+ circumference);

    }
}
