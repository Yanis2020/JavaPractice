package training;

public class SetAndGet4 {
    public static void main(String[] args) {
        SetAndGet3 setAndGet3 = new SetAndGet3();
        setAndGet3.setCountry("Algeria");
        setAndGet3.setDzPhone(213);
        System.out.println("The country is " + setAndGet3.getCountry() + " and Phone code is " + setAndGet3.getDzPhone());


    }
}
