package practice5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        elastic
        size method
         */
        ArrayList<String> listOfCity = new ArrayList<>();
        listOfCity.add("Bejaia");
        listOfCity.add("Sidi Aich");
        listOfCity.add("Chemini");
        listOfCity.add("Akbou");
        listOfCity.remove("Akbou");
        //listOfCity.remove(5)
        System.out.println(listOfCity.size());
        System.out.println(listOfCity);
        System.out.println(listOfCity.get(0));


        // 2 nd method
        for (int i = 0; i < listOfCity.size(); i++) {
            System.out.println(listOfCity.get(i));
        }
        // 3rd method
        listOfCity.add("VA");
        listOfCity.add("DC");

        Iterator iterator = listOfCity.iterator();

        // while the iterator has a value print it
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        ArrayList<Integer> zipCode = new ArrayList<>();
        zipCode.add(25251);
        zipCode.add(25157);
        zipCode.add(25277);

        zipCode.clear();
        System.out.println(zipCode);

        ArrayList<Object> everything = new ArrayList<>();
        everything.add("Hi Y'all");
        everything.add(25);
        everything.add(true);


    }

}
