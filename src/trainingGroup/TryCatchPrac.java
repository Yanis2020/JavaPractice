package trainingGroup;

import java.util.Scanner;

public class TryCatchPrac {

    public static void main(String[] args) {
        /*  A program that want to give a number, if it is not a number the program will tell that
        you entered a non number. It will give the option a number again

        */
        method1();

    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        try {
            int number = scanner.nextInt();
            System.out.println("The number is " + number);

        } catch (Exception e) {
            System.out.println("You entered a non number");
            method1();
        }

    }
}
