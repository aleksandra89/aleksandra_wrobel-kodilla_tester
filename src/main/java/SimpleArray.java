public class SimpleArray {
    public static void main(String[] args){
        String[] namesOfFlowers = new String[5];

        namesOfFlowers[0] = "rose";
        namesOfFlowers[1] = "tulip";
        namesOfFlowers[2] = "poppy";
        namesOfFlowers[3] = "daisy";
        namesOfFlowers[4] = "carnation";

        String flower = namesOfFlowers[3];
        System.out.println(flower);

        int numberOfElements = namesOfFlowers.length;
        System.out.println(numberOfElements);
    }
}
