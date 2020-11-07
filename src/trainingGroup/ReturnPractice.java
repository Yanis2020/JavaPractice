package trainingGroup;

public class ReturnPractice {
    public static void main(String[] args) {
        ReturnPractice returnPractice = new ReturnPractice();
        System.out.println("I have an " + returnPractice.nameOfPhone());
        System.out.println("The model is " + returnPractice.modelPhone());
        System.out.println("The second model is " + returnPractice.namePhone2("Samsung 10"));

        System.out.println("3 numbers to to addition");
        System.out.println(returnPractice.modelPhone2(1, 2, 3));

    }

    public String nameOfPhone() {
        return "Iphone";
    }

    public int modelPhone() {
        return 12;
    }

    public String namePhone2(String name) {
        return name;

    }

    public int modelPhone2(int a, int b, int c) {
        System.out.println("you entered " + a + " " + b + " " + c);
        return (a + b + c);


    }
}
