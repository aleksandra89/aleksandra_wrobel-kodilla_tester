public class Person {

    private double age;
    private String name;
    private double height;


   public Person(String name, double age, double height){

       this.age = age;
       this.name = name;
       this.height = height;

   }
    public void checkParametr() {

        if (name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            }else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }


}
