package practice3;

public class accesSpecifers {
    // public ---->  can go anywhere
    // private ---->  can go same class
    // default---->  can go to the same package & different package's subclass
    // protected  ---->  can go to the same package

    protected static String Car = "Bentley";

    public static void main(String[] args) {
        System.out.println(Car);

    }


}
