package practice7.algorithms;

import java.util.ArrayList;

public class ReversedString {
    public static void main(String[] args) {
        String data = "application";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(data);
        System.out.println(stringBuilder);


        String reverData = stringBuilder.reverse().toString();
        System.out.println(reverData);
        ArrayList<Character> something = new ArrayList<>();
    }
    // find out 2 other way to do the string reverse // Homework


}
