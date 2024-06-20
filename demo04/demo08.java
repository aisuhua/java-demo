
public class demo03 {
    public static void main(String[] args) {
        int day = Weekday.FRI.dayValue;

        System.out.println(day);
    }
}

final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}