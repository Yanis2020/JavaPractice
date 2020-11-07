package training;

public class Train {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        int x = 5;
        int y = 10;
        System.out.println(Math.max(x, y));
        double a = Math.random() * 10;
        int b = (int) a;
        System.out.println("Random number is " + b);

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
        }
        String[] cars = {"Volvo", "BMW", "Ford"};
        for
        (String i :
                cars
        ) {
            System.out.println(i);
        }
    }
}
