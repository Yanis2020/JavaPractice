package trainingGroup;

public class ReturnPract {
    public static void main(String[] args) {
        ReturnPract returnPract = new ReturnPract();
        System.out.println("The city is " + cityOfTheWorld());
        System.out.println();
        city1();
        System.out.println(returnPract.number());
        System.out.println(number2(5, 8, 12));

    }

    public static String cityOfTheWorld() {
        return "New york";
    }

    public static void city1() {
        System.out.println("The capital of new york is new york");
    }

    public static int number2(int a, int b, int c) {

        int d = a + b + c;
        return d;

    }

    public int number() {
        return 5;
    }
}
