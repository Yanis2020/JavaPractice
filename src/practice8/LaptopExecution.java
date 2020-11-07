package practice8;

public class LaptopExecution {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Envy 360", "Hewlett Packcard", 2020);
        laptop.detailOfLaptop();

        Laptop laptop1 = new Laptop("Envy 360", "HP");
        laptop1.detailOfLaptop();
    }
}
