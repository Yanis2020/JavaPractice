package training;

import java.util.Scanner;

public class CarFrom {

    public static void main(String[] args) {
        Cars();

    }

    public static void Cars() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a car maker, I will tell you from what region");
        String CarEntred = scanner.nextLine();
        if (CarEntred.equalsIgnoreCase("Ford") || CarEntred.equalsIgnoreCase("GMC")) {
            System.out.println("It is an American car");
        } else if (CarEntred.equalsIgnoreCase("Toyota") || CarEntred.equalsIgnoreCase("Honda") && CarEntred.equalsIgnoreCase("Nissan")) {
            System.out.println("It is an Asian car");
        } else {
            System.out.println("It is not American neither Asian car");

        }

    }
}
