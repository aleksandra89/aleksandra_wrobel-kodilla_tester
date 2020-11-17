public class Loops {
    public static void main(String[] args) {
        int[] myData = new int[]{5, 10, 15};


        int result = calculateSum(myData);
        System.out.println("Rezultat: " + result);
        System.out.println("Rezultat2: " + calculateSum(new int[]{1,2,3}));
        System.out.println("Rezultat3: " + calculateSum(new int[]{3,4,5}));


    }

    private static int calculateSum(int[] tabel) {
        int suma = 0;
        for (int i = 0; i < tabel.length; i = i + 1) {
            suma = suma + tabel[i];
        }
        return suma;
    }


}