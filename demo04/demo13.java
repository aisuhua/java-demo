import java.util.Random;

public class demo03 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));

        Random random1 = new Random(100);
        System.out.println(random1.nextInt());
    }
}