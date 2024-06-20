
public class demo03 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100));
        System.out.println(Math.max(100, 200));
        System.out.println(Math.PI);

        System.out.println(Math.random());

        double i = Math.random();
        int x = 10;
        int y = 50;

        double z = i * (y - x) + 10;
        long d = (long) z;
        System.out.println(z);
        System.out.println(d);
    }
}