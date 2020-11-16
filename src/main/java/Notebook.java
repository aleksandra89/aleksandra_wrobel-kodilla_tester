public class Notebook {
        String weight;
        int price;
        int year;
        int str;



        public Notebook(String weight, int price, int year) {  //konstrukor
                this.weight = weight;
                this.price = price;
                this.year = year;

        }

        public void checkPrice() {   //metoda

                if (this.price < 600) {
                        System.out.println("This notebook is  very cheap");
                } else if (this.price >=600 && this.price <=1000) {
                        System.out.println("This price is good");
                } else {
                        System.out.println("This notebbok is expensive");
                }

        }
        public void checkWeight() {
                String gram = this.weight.replaceAll("[a-z]", "");
                int str = Integer.valueOf(gram);

                if (this.str <= 600) {
                        System.out.println("This notebook is to light");
                } else if (this.str > 600 && this.str <= 1500) {
                        System.out.println("This notebook is not so heavy");
                } else {
                        System.out.println("This notebook is to heavy");
                }

        }
        public void checkYear() {
                if (this.year <=1990 && this.price <2000) {
                        System.out.println("This notebook is old and cheap");
                }else if (this.year >=2000 && this.price < 2000) {
                        System.out.println("This notebook is quite new and cheap");
                }else if (this.year > 2000 && this.price >=2000) {
                        System.out.println("This notebook is new and cheap");
                } else {
                        System.out.println("This is good notebook");
                }
        }
}
