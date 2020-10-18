package practice4;

public class Conditions {
    public static void main(String[] args) {

        // soccer --- sunday
        // work --- monday
        // Movie -- friday
        // stay at --- home other days
        String today = "tuesday";


        if (today.equalsIgnoreCase("sunday")) {
            System.out.println("I will watch TV");

        } else if (today.equalsIgnoreCase("monday")) {
            System.out.println("I will go to work");
        } else if (today.equalsIgnoreCase("friday")) {
            System.out.println("I will go to the movie theater");
        } else {
            System.out.println("I will stay home");
        }
        int year = 2020;
        if (year == 2020) {
            System.out.println("Hello Corona");
        } else {
            System.out.println("Ola amigos");
        }
        boolean IsTodaySunny = true;
        if (IsTodaySunny){
            System.out.println("let's go fishing");
        } else {
            System.out.println("Stay at home");
        }
        //     ||   ----> or
        int a = 5;
        if (a==5 || a >6){
            System.out.println(a);
        }

        //     && ------> and
        if (a==5 && a >4) {
            System.out.println("to day is the day " + a);
        }
        //     != -----> not equals
        if (a != 4){
            System.out.println("a not not equals to 4. a is "+ a);

        }
        //     == -----> equals

        if (a ==5) {
            System.out.println("a is equals to " + a);
        }

    }
}
