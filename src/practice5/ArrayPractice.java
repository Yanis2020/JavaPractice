package practice5;

public class ArrayPractice {
    public static void main(String[] args) {
        //  String name = "Kaci";
        // String name2 ="Boussad";

        String[] names = {"Kaci", "Boussad", "Danger", "David", "John"};

        //   System.out.println(name);

        //  System.out.println(names[0]);
        //  System.out.println(names[1]);
        //  System.out.println(names[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Try this if any exception occurs
        // catch them and perform some action
        //parent class of all exception is throwable
        try {
            System.out.println(names[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception you are out of the array, fix your index");
        }
        //int [] numbers = {7,5,3,1,10,20,30};
        String[] car = new String[5];
        car[0] = "BMW";
        car[1] = "Toyota";
        car[2] = "Ford";
        System.out.println(car.length);
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        String[] myCars = car.clone();
        System.out.println(myCars.length);


    }
}
