public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000); //typ zmiennej jest taki jak nazwa klasy - klasa to foremka a obiekt to ciastko
        //System.out.println(notebook.weight);// obiekt to notebook, jesli chcemy wywolac sama zmienna to robimy.nazawazmiennej
        //System.out.println(notebook.price);
        System.out.println(notebook.weight + " cena" + notebook.price);
        //if(notebook.price<900) {
           // System.out.println("This notebook is cheap");
       //}
        //else {
            //System.out.println("This notebook is quite expensive");
       // }
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook("2000g", 2000);
        //System.out.println(heavyNotebook.weight);
        //System.out.println(heavyNotebook.price);
        System.out.println(heavyNotebook.weight + " cena" + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("1200g", 200);
        //System.out.println(oldNotebook.weight);
        //System.out.println(oldNotebook.price);
        System.out.println(oldNotebook.weight + " cena" + oldNotebook.price);
        oldNotebook.checkPrice();

        //konkatenacja = laczenie argumentow ciagiem w jednym system.out





    }
}

