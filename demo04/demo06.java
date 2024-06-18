
public class demo03 {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        System.out.println(day);

        if (day == Weekday.SUN || day == Weekday.SAT) {
            System.out.println("today is very well");
        } else {
            System.out.println("today is not very well");
        }

        int i = 100;
        if (i == Weekday.SUN) {

        }
    }
}

enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}