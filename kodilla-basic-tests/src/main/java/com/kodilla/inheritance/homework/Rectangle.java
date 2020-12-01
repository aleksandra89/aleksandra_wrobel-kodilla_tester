package com.kodilla.inheritance.homework;

public class Rectangle extends Shape {

    int a;
    int b;

    Rectangle rectangle = new Rectangle(6, 8);



    public Rectangle(int a, int b) {
        rectangle.caculateArea();
        rectangle.calculateCircumference();


    }

    @Override
    public void caculateArea() {
        int area = a*b;
        System.out.println("Pole prostokąta wynosi: " + area);

    }

    @Override
    public void calculateCircumference() {
        int circumference = 2*a+2*b;
        System.out.println("obwód prostokąta wynosi: " + circumference);

    }
}
