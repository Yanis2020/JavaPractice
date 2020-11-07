package practice4.oop.classwork;

public class Execution {


    /*  create a interface with some business concept
    // create a abstract class with some concept and some implementation
    // create your business with those previous ideas
    // and run your business and show how the methods are working in the Execution Class
     */
    public static void main(String[] args) {
        BestPhoneRepair bestPhoneRepair = new BestPhoneRepair();
        bestPhoneRepair.hourOfWork();
        bestPhoneRepair.location();
        bestPhoneRepair.payWithCard();
        bestPhoneRepair.payWithPhone();
        bestPhoneRepair.phoneRepair();

    }


}
