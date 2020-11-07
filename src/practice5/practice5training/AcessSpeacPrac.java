package practice5.practice5training;

public class AcessSpeacPrac {

    protected static String modelCar = "Tesla";


    public static void main(String[] args) {
        System.out.println(modelCar);
        String mo = modelCar;
        System.out.println(mo);
        AcessSpeacPrac acessSpeacPrac = new AcessSpeacPrac();
        acessSpeacPrac.abc(1, 2, "One", "two");
        acessSpeacPrac.abc(5, "Hola");

    }

    public void abc(int a, int b, String c, String d) {

        int f = a + b;
        System.out.println("The sum of a+b is " + f + " and c is " + c + " and d is " + d);
    }

    public void abc(int a, String c) {

        System.out.println("a is  " + a + " c is " + c);
    }
}
