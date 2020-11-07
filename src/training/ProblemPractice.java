package training;

import java.util.Random;
import java.util.Scanner;

public class ProblemPractice {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner scanner1 = new Scanner(System.in);

        System.out.println("How Many Friends Do You Have");
        int numEntred = scanner.nextInt();
        System.out.println(numEntred);
        // scanner.close();

        String[] names = new String[numEntred];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < numEntred; i++) {
            System.out.println("Enter the name of friend " + (i + 1));
            names[i] = scanner1.nextLine();
            System.out.println(names[i]);

        }
        //input.close();
        System.out.println("your friends are");
        for (int j = 1; j < numEntred; j++) {
            System.out.println(names[j]);
        }
        Random random = new Random();
        int x = random.nextInt(numEntred);
        System.out.println("thank you .you best friend is ");
        System.out.println(names[x]);
    }
}

