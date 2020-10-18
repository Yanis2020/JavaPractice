package practice3;

public class ForLoopPractice {
    public static void main(String[] args) {

        /* (--for is bodyStarts  dataType  variable = startingPoint; variable++-- bodyEnds {
        // what you want to run}
                 */
        for (int i = 0; i < 5; i++) {
            System.out.println("People and Tech " + (i + 1));
        }
        for (int i = 0; i > -5; i--) {
            System.out.println("Hello Java World " + (i - 1));
        }

    }
}
