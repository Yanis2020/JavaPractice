package practice7.training;

public class Season {
    private final Months months;

    public Season(Months month) {
        this.months = month;
    }

    public void seasonOfYear() {
        switch (months) {
            case January:
                System.out.println("It is winter season");
                break;
            case June:
                System.out.println("it is summer season");
                break;
            case March:
                System.out.println("it is spring season");
                break;


        }

    }
}
