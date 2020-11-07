package practice7;

public class Week {
    private final Days days;

    public Week(Days days) {

        this.days = days;
    }

    public void whatToDo() {
        switch (days) {
            case Friday:
                System.out.println("Stay home");
                break;
            case Monday:
                System.out.println("Go to works");
                break;
            case Saturday:
                System.out.println("Go to soccer");
                break;
        }
    }
}
