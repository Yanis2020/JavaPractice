package practice4.oop.abstraction;

public class RunableCar extends Car implements Vehicle, Vehicle2 {

    // i --- i
    // ipmlements -- interface
    // extends -- class/abstract class
    // implement more than one interface is allowed
    // only one abstract class/ class is allowed


    // method overriding  --->same method name, different/ same param in the different class
    // dynamic polymorphism or run time polymorphism
    @Override
    public void wheels() {
        System.out.println("4 wheels");

    }

    @Override
    public void move() {
        System.out.println("The RunableCar can move");

    }

    @Override
    public void start() {
        System.out.println("The RunableCar can start");
    }

    @Override
    public void stop() {
        System.out.println("The RunableCar can stop");

    }

    @Override
    public void name() {
        System.out.println("The RunableCar has a name car");

    }

    @Override
    public void window() {

    }
}
