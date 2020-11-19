public class Application2 {

    double wiek;
    String imie;
    double wzrost;


   public Application2(String imie, double wiek, double wzrost){

       this.wiek = wiek;
       this.imie = imie;
       this.wzrost = wzrost;

   }
    public void checkParametr() {

        if (imie != null) {
            if (this.wiek > 30 && this.wzrost > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            }else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }


}
