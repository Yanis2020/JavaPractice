package training;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class EnumTraining {
    public static void main(String[] args) {
        // Training();
        Training1();

    }

    public static void Training() {
        Enumeration Country;
        Vector Cou = new Vector();
        Cou.add("Algeria");
        Cou.add("Morroco");
        Cou.add("Tunisia");
        Country = Cou.elements();
        while (Country.hasMoreElements()) {
            System.out.println(Country.nextElement());
        }
    }

    public static void Training1() {
        Enumeration CarsType;
        Vector cars = new Vector();
        //  cars.add("Toyota");
        //   cars.add("Honda");
        //cars.add("BMW");
        //cars.add("Mercedes");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a car Type");
        // String CarType = scanner.nextLine();
        // cars.add("CarsType");
        cars.add(scanner.nextLine());
        //cars.add(CarsType);
        cars.add(scanner.nextLine());
        cars.add(scanner.nextLine());
        cars.add(scanner.nextLine());


        CarsType = cars.elements();

        while (CarsType.hasMoreElements()) {
            System.out.println(CarsType.nextElement());
        }


    }

}


