package practice5.practice5training;

public class SingletonPrac2 {

    private static SingletonPrac2 singletonPrac2 = null;

    private SingletonPrac2() {
        //   System.out.println("hello word");

    }

    public static SingletonPrac2 getInstance() {
        while (singletonPrac2 == null) {
            singletonPrac2 = new SingletonPrac2();
        }
        return singletonPrac2;
    }

    public int number() {
        return 7;
    }
}
