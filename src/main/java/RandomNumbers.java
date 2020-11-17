public class RandomNumbers {

    public static void main(String[] args){
        int max = 5000;

        public int randomNumber (int max){

            Random random = new Random();
            int result = 0;
            int suma = 0;
            while (suma <max) {

                int i = random.nextInt(30);
                suma = suma+ i;
                result++;
            }

            return result;
            }

        }




    }
}
