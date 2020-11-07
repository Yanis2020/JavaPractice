package practice8;

public class LoopPractice {
    // write an application which will print selenium 5 times
    // for each selenium , it will print java 3 times
    // when java is getting printed for second and third time, print "i hate java" instead of "java"
    // and for the 3rd and 5th time of selenium print, instead of "selenium", print "i love selenium"
    // if selenium get printed for third time and java get printed for second time print your name
    // if selenium get printed for third time and java get printed for second time print your name

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2 || i == 4) {
                System.out.println("I love selenium");
            } else if (i == 1) {
                System.out.println("print my name in selenium");
            } else {
                System.out.println("Selenium ");

            }


            for (int j = 0; j < 3; j++) {
                System.out.println("Java ");
                if (j == 1 || j == 2) {
                    System.out.println("I hate java");
                } else if (j == 0) {
                    System.out.println("print my name in java");

                }
            }


        }
    }

}