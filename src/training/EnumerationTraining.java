package training;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTraining {
    public static void main(String[] args) {
        Enumeration daysOfTheWeekday;
        Vector days = new Vector();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        daysOfTheWeekday = days.elements();
        //   System.out.println(days);
        while (daysOfTheWeekday.hasMoreElements()) {
            System.out.println(daysOfTheWeekday.nextElement());
        }

    }
}
