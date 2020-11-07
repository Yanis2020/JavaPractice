package training;

import java.util.Scanner;

public class WhilePractice {
    public static void main(String[] args) {
        While1();
    }

    public static void While1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to repeat Aloa amigos ");
        int num = scanner.nextInt();
        scanner.close();
        int a = 0;
        while (a < num) {
            System.out.println("Azul Felawen  " + (a + 1));
            a++;
        }

    }
}