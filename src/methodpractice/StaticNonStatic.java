package methodpractice;

public class StaticNonStatic {

    public static void main(String[] args) {
        printMyName();

        StaticNonStatic refferenceVariable = new StaticNonStatic();
        // name of the class that we wANT TO CREATE object of --refference variable of the class
        // (=new)-->law
        refferenceVariable.printMyState();

    }

    // if you don't use the keyword static  it becomes non static
    public static void printMyName() {
        System.out.println("Mayas");
        City();
    }

    public static void City() {
        System.out.println("My city is Austin");
    }

    public void printMyState() {
        System.out.println("The state I live in is Texas");

    }

    public void printMyAge() {
        System.out.println("My age is 2");
        printMyName(); // can go inside a non static method
    }
    // static --> is a keyword

    //1. static method/variable ---> can go inside static method or non static method

    //2. non-static method/variable ---> can go inside non-static method
    //3. if we still have to take non static methods, we should use Objects of this class
}
