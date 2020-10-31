public class FirstClass {
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!");

            if (1 > 2){
                System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
            } else {
                System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
            }
            int yourAge = 12;

            System.out.println(yourAge);
        if (yourAge < 10){
            System.out.println("You're a kid");
        } else if (yourAge > 10 && yourAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }

    }
}

