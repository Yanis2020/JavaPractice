package practice5;

public class LaptopExecution2 {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        String model = laptop.getMethodOfTheLaptop();
        System.out.println(model);
    }
}
