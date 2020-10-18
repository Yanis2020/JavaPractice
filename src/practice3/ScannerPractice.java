package practice3;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        //nameScanner();
        calculator();

    }
    public static void nameScanner (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Hi "+ name);

    }
    public static void calculator (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number ");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.println("the sum is " + c);
        scanner.close();
    }
}
