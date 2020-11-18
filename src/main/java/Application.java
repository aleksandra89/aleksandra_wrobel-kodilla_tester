public class Application{
    public static void main(String[] args) {

      Person person = new Person(String imie, double wiek, double wzrost){

          this.imie = imie;
          this.wiek = wiek;
          this.wzrost = wzrost;
        }

        public void checkParametr() {

          if (imie != null) {
              if (wiek > 30 && wzrost > 160) {
                  System.out.println("User is older than 30 and higher than 160cm");
              }else {
                  System.out.println("User is 30 (or younger) or 160cm (or shorter)");
              }
          }
        }


    }











}
