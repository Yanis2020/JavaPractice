package practice7.algorithms;

import java.util.Scanner;

public class ReverseTraining {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();

        word = word.trim();
        String result = "";
        char[] listOfChar = word.toCharArray();
        for (int i = listOfChar.length - 1; i >= 0; i--) {
            result = result + listOfChar[i];
        }
        System.out.println("The reverse word is " + result.trim());
    }
}

