package practice4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = scanner.nextInt();
        int b;
        System.out.println("Please enter the second number");
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter the second number");
            b = scanner.nextInt();
        }


        int c = a+ b;

        System.out.println( "the total is "+ c);
    }
}
