package practice5.practice5training;

public class SingletonPrac {
    // 1  create private static object of instance class is null

    private static SingletonPrac singletonPrac = null;

    //2 create a private constructor
    private SingletonPrac() {

    }

    //3 public static method which has a return type of the class object getInstance
    public static SingletonPrac getInstance() {
        while (singletonPrac == null) {
            singletonPrac = new SingletonPrac();
        }
        return singletonPrac;
    }


}
