public class LeapYear {
    public static void main(String[] args) {
        int firstYear = 2220;


        System.out.println(firstYear);


        if (firstYear%4==0 && firstYear%100==0 &&firstYear%400==0) {
            System.out.println("rok przestepny");
        } else {
            System.out.println("to nie jest rok przestepny");
        }
    }
}
