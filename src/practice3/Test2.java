package practice3;

public class Test2 {

    public Test2() {
        // The constructor is called
    }

    public static void main(String[] args) {
        double x = Number(6, 2);
        double y = Number(6, 2, 3);

        System.out.println(x);
        System.out.println(y);

    }

    public static double Number(double a, double b) {
        double c = a / b;
        return c;
    }

    public static double Number(double a, double b, double d) {
        double c = (a / b) * d;
        return c;
    }
}
