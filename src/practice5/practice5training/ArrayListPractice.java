package practice5.practice5training;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayPractice {
    public static void main(String[] args) {
        arrayPrac();
        arrayPrac2();
        arrayPrac3();

    }

    public static void arrayPrac() {
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Bejaia");
        cityNames.add("Algiers");
        cityNames.add("Adrar");
        for (int i = 0; i < cityNames.size(); i++) {
            System.out.println(cityNames.get(i));
        }
    }

        public static void arrayPrac2(){
            ArrayList<String> names = new ArrayList<>();
            names.add("Yanis");
            names.add("Mayas");
            names.add("Zaher");
            Iterator iterator = names.iterator();

            while (iterator.hasNext()) {

                System.out.println(iterator.next());


            }


        }
        public static void arrayPrac3 () {
        ArrayList<Integer> zipCode = new ArrayList<>();
        zipCode.add(78701);
        zipCode.add(78702);
        zipCode.add(78703);
        for (int j=0; j<zipCode.size();j++){
            System.out.println(zipCode.get(j));
        }
            System.out.println();
        Iterator iterator= zipCode.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }


    }

