package com.kodilla.inheritance.homework;

public abstract class Shape {

   /* private int a;
    private int b;
    private int h;

    public Shape (int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getH() {
        return h;
    }*/

    public abstract void caculateArea();  //metody abstrakcyjne nalezy zaimpementowac do klasy dziedziczacej
    public abstract void calculateCircumference();
}
