

public class UserTest{
    public static void main(String[] agrs) {

        User anna = new User("Anna", 16);
        User patrycja = new User("Patrycja", 20);
        User marek = new User("Marek", 35);
        User kamil = new User("Kamil", 40);
        User monika = new User("Monika", 12);

        User[] users = {anna, patrycja, marek, kamil, monika};

        int suma = anna.age + marek.age + patrycja.age + kamil.age + monika.age;
        System.out.println(suma);

        int average = suma/users.length;
        System.out.println(average);

        for (int i=0; i<users.length; i++){
            System.out.println(this.name);



        }

    }
}