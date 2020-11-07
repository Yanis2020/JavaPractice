package training;

import java.util.Scanner;

public class ProblemPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please a number of friend that you want to enter");
        int numEntered = scanner.nextInt();
        System.out.println(numEntered);

        String[] friendNames = new String[numEntered];
        System.out.println(friendNames.length);
        int i = 0;
        while (i < numEntered) {
            // for (int i=0; i<numEntered;i++){
            System.out.println("please enter a friend name");


            friendNames[i] = scanner1.nextLine();
            System.out.println(friendNames[i]);
            i++;
        }
    }
}
