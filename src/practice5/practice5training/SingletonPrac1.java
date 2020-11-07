package practice5.practice5training;

public class SingletonPrac1 {

    // 1 create an private pbject that is null
    // 2 create a public constructor
    // 3 create a return method

    private static SingletonPrac1 singletonPrac1 = null;

    private SingletonPrac1() {

    }

    public static SingletonPrac1 getInstance() {
        while (singletonPrac1 == null) {
            singletonPrac1 = new SingletonPrac1();
        }
        return singletonPrac1;
    }


}
