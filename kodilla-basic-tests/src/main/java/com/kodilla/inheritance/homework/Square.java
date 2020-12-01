package com.kodilla.inheritance.homework;

public class Square extends Shape {

    int a;
    int b;

    Square square  = new Square(6, 6);



    public Square(int a, int b) {
        square.caculateArea();
        square.calculateCircumference();


    }

    @Override
    public void caculateArea() {

        int area = a*a;
        System.out.println("Pole kwadratu wynosi: " + area);
    }

    @Override
    public void calculateCircumference() {
        int circumference = 2*a+2*b;
        System.out.println("Obwód kwadratu wynosi:" + circumference);

    }
}
