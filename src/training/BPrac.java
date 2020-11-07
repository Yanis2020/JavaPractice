package training;

public class BPrac {
    public static void main(String[] args) {
        APrac aPrac = APrac.getInstance();
        int c = aPrac.countNumbers(10, 15);
        System.out.println("the total number is " + c);

    }
}
