
import java.util.Scanner;

public class color {

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj pierwszą literę koloru ");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color){
                case "r":
                    System.out.println("red");
                case "b":
                    System.out.println("black");
                case "p":
                    System.out.println("pink");
                case "w":
                    System.out.println("white");
                default:
                    System.out.println("Zła litera, podaj poprawną");
            }
        }
    }

    public static void main(String[] args) {
        color color = new color();
        String result = color.getColor();
        System.out.println("Kolor: " + result);
    }
}

