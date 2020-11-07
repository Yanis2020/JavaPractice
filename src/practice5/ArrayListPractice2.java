package practice5;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> cityOfUSA = new ArrayList<>();
        cityOfUSA.add("NY");
        cityOfUSA.add("NJ");
        cityOfUSA.add("VA");
        cityOfUSA.add("DC");

        ArrayList<String> cityOfCanada = new ArrayList<>();
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Vancouver");

        ArrayList<ArrayList<String>> world = new ArrayList<>();
        world.add(cityOfUSA);
        world.add(cityOfCanada);
        System.out.println(world);

    }
}
