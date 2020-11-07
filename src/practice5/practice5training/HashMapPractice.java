package practice5.practice5training;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        training();
    }

    public static void training() {
        HashMap<Integer, String> Country = new HashMap<>();
        Country.put(1, "Algeria");
        Country.put(2, "USA");
        Country.put(3, "Canada");

        HashMap<Integer, String> Continent = new HashMap<>();
        Continent.put(1, "Africa");
        Continent.put(2, "America");

        System.out.println(Country);
        System.out.println(Continent);

        HashMap<String, HashMap<Integer, String>> Abc = new HashMap();
        Abc.put("Country name : ", Country);
        Abc.put("Continent name ", Continent);

        System.out.println();
        System.out.println(Abc);
        System.out.println("The size is " + Country.size());
        System.out.println("Print with get");


        for (int i = 1; i <= Country.size(); i++) {
            System.out.println(Country.get(i));
        }

    }
}
