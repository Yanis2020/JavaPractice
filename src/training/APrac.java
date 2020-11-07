package training;

public class APrac {

    //1 crate a private static object = null halfway
    private static APrac aPrac = null;

    //2 create a private parameter
    private APrac() {

    }

    //3
    public static APrac getInstance() {
        while (aPrac == null) {
            aPrac = new APrac();
        }
        return aPrac;
    }

    public int countNumbers(int a, int b) {
        return (a + b);
    }
}
