import java.util.Arrays;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class demo03 {
    public static void main(String[] args) {
        SecureRandom random = null;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            random = new SecureRandom();
        }

        byte[] salt = new byte[16];
        random.nextBytes(salt);
        System.out.println(Arrays.toString(salt));
    }
}