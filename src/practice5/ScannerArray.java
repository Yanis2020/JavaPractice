package practice5;

import java.util.Random;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        /* from the user , take a list of 5 food they likes
        give a them a random food to eat
         */
        food();
    }

    public static void food() {
        String[] FoodToEat = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("We need from you to enter 5 food that you like ");
        for (int i = 0; i < 5; i++) {
            System.out.println("You need to enter " + (5 - i) + " more food ");
            FoodToEat[i] = scanner.nextLine();
        }

        Random random = new Random();
        System.out.println("Today yo will eat " + FoodToEat[random.nextInt(4)]);


    }
}
