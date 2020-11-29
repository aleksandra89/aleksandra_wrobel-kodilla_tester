package com.kodilla.abstracts;

public class Trapeze extends Shape {

    int c = 5;
    int d = 7;


    public Trapeze () {
        super(5, 8, 3);
    }

    @Override
    public void caculateArea() {
        double area = (double) (getA()+getB())*getH()/2;
        System.out.println("Pole trapezu wynosi: " + area);

    }

    @Override
    public void calculateCircumference() {
        int circumference = getA()+getB()+c+d;
        System.out.println("Obwód trapezu wynosi: "+ circumference);

    }
}
