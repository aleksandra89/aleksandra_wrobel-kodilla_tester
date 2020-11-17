public class LeapYear {
    public static void main(String[] args) {
        int year = 1904  ;


        System.out.println(year);


        if ((year%400==0 || year%100!=0) && (year%4==0) ) {
            System.out.println("rok przestepny");

        }else {
            System.out.println("nie przestępny");
        }
    }
}
