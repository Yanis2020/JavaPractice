package practice8;

public class LoopPractice2 {
    public static void main(String[] args) {
        // 3, 1, 10, 2, 5, 3, 100

        int[] numbers = {3, 1, 10, 2, 5, 3, 100};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;

                }
            }
        }
        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }

    }
}
