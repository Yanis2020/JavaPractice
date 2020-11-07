package training;

import java.util.Scanner;

public class HiAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("name entered is " + name);
        scanner.close();

    }
}
