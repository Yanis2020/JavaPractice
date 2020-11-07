package trainingGroup;

public class Brazil {
    public static void main(String[] args) {

        int[] age = new int[2];
        age[0] = 7;
        age[1] = 8;
        System.out.println(age[0] + " " + age[1]);


        Brazil brazil = new Brazil();

        System.out.println(brazil.bestPlayer());
        System.out.println(brazil.manager());
    }

    public String bestPlayer() {
        return "Neymar";
    }

    public String manager() {
        return "Dunga";
    }

}
