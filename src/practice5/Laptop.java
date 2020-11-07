package practice5;

public class Laptop {


    // Singleton   ---> single instance of a class
    // 1. private static object of the class(Halfway).
    private static Laptop laptop = null;

    // 2. private constructor
    private Laptop() {

    }

    // 3. public static method which has return type of the class (object)
    public static Laptop getInstance() {
        if (laptop == null) {
            laptop = new Laptop();
        }
        return laptop;
    }


    public String getMethodOfTheLaptop() {
        return "Mac";
    }
}
