package practice5;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        // key - value
        HashMap<Integer, String> studentInforamtion = new HashMap<>();
        studentInforamtion.put(1, "Mahrez");
        studentInforamtion.put(2, "Michael");
        studentInforamtion.put(3, "Mayas");

        System.out.println(studentInforamtion.get(2));

        HashMap<String, Integer> locationInfo = new HashMap<>();
        locationInfo.put("Park", 7);
        locationInfo.put("home", 9);
        System.out.println(locationInfo.get("home"));

        System.out.println(studentInforamtion);
        System.out.println(locationInfo);

        System.out.println(studentInforamtion.size());
        System.out.println(studentInforamtion.containsKey(2));
        System.out.println(studentInforamtion.containsKey(22));
        System.out.println(locationInfo.containsKey("home"));
    }
}
