package practice8;

public class Laptop {

    String model;
    int year;
    String make;


    // default constructor
    public Laptop(String model, String make, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public Laptop(String model, String make) {
        this.make = make;
        this.model = model;


    }

    public void detailOfLaptop() {
        System.out.println(model);
        System.out.println(year);
        System.out.println(make);
    }
}
