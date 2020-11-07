package methodpractice;

public class Olympic {

    public static void main(String[] args) {
        /*
         * For USA
         */

        System.out.println(Usa.state);

        Usa ObjUsa = new Usa();
        System.out.println(ObjUsa.zipCode);
        System.out.println(ObjUsa.name);

        System.out.println();
        /*
         * For Canada
         */

        System.out.println(Canada.province);

        Canada ObjCan = new Canada();
        System.out.println(ObjCan.zipcode);
        System.out.println(ObjCan.name);

    }

}
