public class demo01 {
    public static void main(String[] args) {
        String str = "suhua123";
        System.out.println(str);

        String str2 = new String("suhua123");
        System.out.println(str2);

        String str3 = new String(new char[] {'s', 'u', 'h', 'u', 'a', '1', '2', '3'});
        System.out.println(str3);
    }
}
