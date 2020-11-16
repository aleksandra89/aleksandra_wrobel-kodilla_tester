public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2000); //typ zmiennej jest taki jak nazwa klasy - klasa to foremka a obiekt to ciastko
        //System.out.println(notebook.weight);// obiekt to notebook, jesli chcemy wywolac sama zmienna to robimy.nazawazmiennej
        //System.out.println(notebook.price);
        System.out.println(notebook.weight + " cena " + notebook.price + " rok " + notebook.year);
        //if(no`tebook.price<900) {
           // System.out.println("This notebook is cheap");
       //}
        //else {
            //System.out.println("This notebook is quite expensive");
       // }
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook("2000g", 2000, 2003);
        //System.out.println(heavyNotebook.weight);
        //System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.weight + " cena " + heavyNotebook.price + " rok " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook("1200g", 200, 1990);
        //System.out.println(oldNotebook.weight);
        //System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.weight + " cena " + oldNotebook.price + " rok " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        //konkatenacja = laczenie argumentow ciagiem w jednym system.out





    }
}

