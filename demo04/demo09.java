
public class demo03 {
    public static void main(String[] args) {
        Point p = new Point(100, 200);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
    }
}

record Point(int x, int y) {}