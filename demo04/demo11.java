import java.math.BigInteger;

public class demo03 {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1234567890");
        System.out.println(i1.pow(5));
        System.out.println(i1.add(i1));
        System.out.println(i1.pow(5).longValue());
        System.out.println(i1.pow(5).longValueExact());
    }
}