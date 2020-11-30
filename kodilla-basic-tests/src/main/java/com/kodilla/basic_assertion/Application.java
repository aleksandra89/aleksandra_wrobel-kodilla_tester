package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 6;
        int d = 2;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        }else
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);

        double  square = calculator.square(c,d);
        boolean correctsq = ResultChecker.assertEquals(36, square );
        if (correctsq) {
            System.out.println("Metoda działa poprawnie dla liczby " + c);
        }else
            System.out.println("Metoda nie działa poprawnie dla liczby " + c);

    }
}
