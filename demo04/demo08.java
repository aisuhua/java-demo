
public class demo03 {
    public static void main(String[] args) {
        Point p = new Point(100, 200);
        System.out.println(p.x());
        System.out.println(p.y());
    }
}

final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }
}