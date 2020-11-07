package training;

public class GroupTraining {
    public static void main(String[] args) {
        GroupTraining groupTraining = new GroupTraining();
        groupTraining.addTwoNumbers();

    }

    public static void method3() {
        GroupTraining groupTraining = new GroupTraining();

        groupTraining.addTwoNumbers();
    }

    public static int numbers() {
        return numbers();
    }

    private void addTwoNumbers() {
        int number1 = 10;
        int number2 = 5;

        int result = number1 + number2;

        System.out.println("the result is " + result);

    }

    public void method2() {
        addTwoNumbers();
    }


}
