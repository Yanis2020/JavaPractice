package practice5;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<Integer, String> student = new Hashtable<>();

        student.put(12, "Yanis");
        student.put(15, "James");

        System.out.println(student);
    }
}
