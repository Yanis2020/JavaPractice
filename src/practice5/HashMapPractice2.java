package practice5;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {
    public static void main(String[] args) {
        HashMap<String, Integer> cityAndZipUSA = new HashMap<>();
        cityAndZipUSA.put("NY", 12345);
        cityAndZipUSA.put("NJ", 12346);

        HashMap<String, Integer> cityAndZipCanada = new HashMap<>();
        cityAndZipCanada.put("Montreal", 00001);
        cityAndZipCanada.put("Toronto", 00002);

        // Will organize by key world String USA and Canada
        HashMap<String, HashMap<String, Integer>> cityAndZip = new HashMap();
        cityAndZip.put("USA", cityAndZipCanada);
        cityAndZip.put("Canada", cityAndZipUSA);
        System.out.println(cityAndZip);

        // will organize in list without a keyword

        ArrayList<HashMap<String, Integer>> listCity = new ArrayList<>();
        listCity.add(cityAndZipUSA);
        listCity.add(cityAndZipCanada);
        System.out.println(listCity);

    }
}
