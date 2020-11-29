

public class UserTest{
    public static void main(String[] agrs) {

        User anna = new User("Anna", 16);
        User patrycja = new User("Patrycja", 20);
        User marek = new User("Marek", 35);
        User kamil = new User("Kamil", 40);
        User monika = new User("Monika", 12);

        User[] users = {anna, patrycja, marek, kamil, monika};

        int suma=0;
        for (int i=0; i<users.length; i++){
            suma=suma+users[i].getAge();
        }
            double average =(double) suma/users.length;
        for (int i=0; i<users.length; i++) {
            if ( users[i].getAge() < average ) {
                System.out.println(users[i].getName());
            }
        }
        }


    }
