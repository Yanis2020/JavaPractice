package training;

public class LoopPractice {

    public static void main(String[] args) {
        LoopPractice loopPractice = new LoopPractice();
        loopPractice.Loop1();
        Loop2();

    }

    public static void Loop2() {
        for (int c = 0; c < 5; c++) {
            System.out.println("c is equal to " + c);

            for (int d = 0; d < 3; d++) {
                System.out.println("d is equal to " + d);
            }
        }

    }

    public void Loop1() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Hi All");
            for (int a = 0; a < 2; a++) {
                System.out.println("Hola");
                for (int b = 0; b < 2; b++) {
                    System.out.println("Aloa");
                }
            }
        }

    }
}