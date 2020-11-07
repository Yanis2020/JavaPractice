package practice5.practice5training;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {
    public static void main(String[] args) {
        haSet();
    }

    public static void haSet() {
        HashSet<String> exemple = new HashSet<>();
        exemple.add("Hola");
        exemple.add("Hi");
        exemple.add("Azul");
        System.out.println(exemple);
        Iterator iterator = exemple.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
