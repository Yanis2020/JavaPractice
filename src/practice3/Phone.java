package practice3;

public class Phone {
   static String model;
    public static void printPhone (){
        System.out.println(model);
    }
    public static void printPhone (String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
       // Phone phone = new Phone();
        Phone.printPhone("Condor");
    }
}
