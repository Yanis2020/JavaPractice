package methodpractice;

public class RealMadrid {

    public static void main(String[] args) {
        Stad();

        RealMadrid ObjMadrid = new RealMadrid();
        ObjMadrid.Madrid();
        ObjMadrid.Zidane();


    }

    public static void Stad() {
        System.out.println("Real Madrid FC stadium is Santiago Bernabiu");
    }

    public void Madrid() {
        System.out.println("Hala Madrid");
    }

    public void Zidane() {
        System.out.println("Real Madrid manger is Zinedine Zidane");
    }


}
