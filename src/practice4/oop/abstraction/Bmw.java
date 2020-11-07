package practice4.oop.abstraction;

public class Bmw extends RunableCar {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.start();
    }

    @Override
    public void start() {
        super.start();
    }

}
