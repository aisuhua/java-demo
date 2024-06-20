
public class demo03 {
    public static void main(String[] args) {
        Point p = new Point(100, 200);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);

        Point p1 = Point.of(100, 200);
        System.out.println(p1);

        Point p2 = Point.of();
        System.out.println(p2);
    }
}

record Point(int x, int y) {
    // 参数检查
    public Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static Point of() {
        return new Point(0, 0);
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}