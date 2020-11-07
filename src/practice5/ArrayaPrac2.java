package practice5;

import java.util.Random;

public class ArrayaPrac2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1234;
        // random int every time
        // create an Random object from Random class
        Random random = new Random();

        // get a random value and store it in x
        int x = random.nextInt(1000);
        System.out.println("The value of the random x is : " + x);
        System.out.println();

        // Loop 1 to store random value in the array numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        // loop 2 to print the value in numbers variable
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}
