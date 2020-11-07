package practice5.practice5training;

import java.util.ArrayList;
import java.util.List;

public class ListPract1 {
    public static void main(String[] args) {
        listOfCities();

    }

    public static void listOfCities() {
        List<String> cities = new ArrayList<>();
        cities.add("NY");
        cities.add("NJ");
        cities.add("DC");
        System.out.println(cities);
    }
}
