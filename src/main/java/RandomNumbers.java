import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int largest = 0;
        int smallest = 0;
        Random random = new Random();
        int a = random.nextInt(31);
        int sum = 0;
        while (sum < 5000)
            sum = sum + a;
        System.out.println(sum);


    }
}