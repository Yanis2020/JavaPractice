package practice5.practice5training;


public class ArrayPractice {
    public static void main(String[] args) {
        arrayPrac();
        arrayPrac4();

    }

    public static void arrayPrac() {
        String[] city = new String[5];
        city[0] = "Bejaia";
        city[1] = "Algiers";
        city[2] = "Cirta";
        city[3] = "Tipaza";
        city[4] = "Tigentourine";
        for (int i = 0; i < city.length; i++) {

            System.out.println(city[i]);
        }
        System.out.println();
        int j = 0;
        while (j < city.length) {
            System.out.println(city[j]);
            j++;

        }
    }

    public static void arrayPrac4() {
        String[] names = {"Mayas", "Yanis", "Zaher"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
        System.out.println();

        int j = 0;
        while (j < names.length) {
            System.out.println(names[j]);
            j++;
        }
    }

}

