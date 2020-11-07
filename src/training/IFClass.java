package training;

import java.util.Scanner;

public class IFClass {
    public static void main(String[] args) {
        IFClass ifClass = new IFClass();
        ifClass.IfCondition();

    }

    public void IfCondition() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 30 ");
        int a = scanner.nextInt();
        if (a < 10) {
            System.out.println("The number you entered " + a + " is less than 10");
        } else if (a < 20 && a > 10) {
            System.out.println("The number entered " + a + " is between 10 and 20");

        } else if (a < 30 & a > 20) {
            System.out.println("The number entered " + a + " is between 20 and 30 ");
        } else {
            System.out.println("The number entered " + a + " is not between 1 and 30 ");
        }
    }

}
