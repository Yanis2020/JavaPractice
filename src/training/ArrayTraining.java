package training;

public class ArrayTraining {
    public static void main(String[] args) {
        ArrayTraining arrayTraining = new ArrayTraining();
        arrayTraining.Practice();

        Practice1();

    }

    private static void Practice1() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);

        int a = numbers[0];
        int b = numbers[1];
        int[] lot = {1, 2, 3};

        int c = numbers.length;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println(lot[1] + lot[2]);


    }

    private void Practice() {
        String[] Cities = {"Yanis", "Mayas", "Emily"};
        System.out.println(Cities[0] + " is the father of " + Cities[1]);

        String Y = Cities[0];
        String M = Cities[1];
        String E = Cities[2];

        System.out.println(Y + " " + M + " " + E);
    }
}
