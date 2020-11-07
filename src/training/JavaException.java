package training;

import java.util.Scanner;

public class JavaException {
    public static void main(String[] args) {
        ExcepPractice();


    }

    public static void ExcepPractice() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");

        try {
            int a = scanner.nextInt();
            System.out.println("You entered " + a);
        } catch (Exception e) {
            System.out.println("Please enter a valid number this time ");
            //   e.printStackTrace();
            System.out.println();
            ExcepPractice();

        }

    }

}




