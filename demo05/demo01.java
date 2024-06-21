import java.io.UnsupportedEncodingException;
import java.util.Arrays;

class demo {
    public static void main(String[] args) {
        try {
            
        }
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    public static byte[] toGBK(String str) throws UnsupportedEncodingException {
        return str.getBytes("GBK");
    }
}