package practice5.practice5training;

import java.util.Hashtable;

public class HashTablePrac {
    public static void main(String[] args) {
        hashTab1();

    }

    public static void hashTab1() {
        Hashtable<Integer, Integer> Hola = new Hashtable<>();
        Hola.put(5, 10);
        Hola.put(2, 7);
        Hola.put(0, 3);
        System.out.println(Hola);


    }
}
