package practice3;

public class Test {
    int num;
    String name;

    Test() {
        System.out.println("Constructor called");
    }


    public static void main(String[] args) {

        Test test1 = new Test();

        System.out.println(test1.name);
        System.out.println(test1.num);

        System.out.println("---------");
        Test test = new Test();
        test.Test2();
    }

    public void Test2() {
        this.num = num;
        this.name = name;
        System.out.println(num);
        System.out.println(name);

    }

}
