
public class demo03 {
    public static void main(String[] args) {
        int day = Weekday.FRI.dayValue;

        System.out.println(day);
    }
}

enum Weekday {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7) ;

    public final int dayValue;

    private Weekday(int dayValue) {
        this.dayValue = dayValue;
    }
}