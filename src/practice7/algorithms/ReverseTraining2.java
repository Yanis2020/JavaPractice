package practice7.algorithms;

public class ReverseTraining2 {
    public static void main(String[] args) {
        methodToReverse("Algeria");

    }

    public static void methodToReverse(String word) {

        word = word.trim();
        String result = "";
        char[] listOfChar = word.toCharArray();
        for (int i = listOfChar.length - 1; i >= 0; i--) {
            result = result + listOfChar[i];
        }
        System.out.println("The reverse word is : " + result.trim());
    }
}
