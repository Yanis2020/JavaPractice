package practice5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("NY");
        cities.add("NJ");
        cities.add("DC");
        cities.add("NY");
        System.out.println(cities);

        Iterator iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next().toString();
            System.out.println(city);
        }
        //  ArrayList<String > listCities = new ArrayList<>();
        // while (iterator.hasNext()){
        //     listCities.add(cities);

        //  }
    }
}
