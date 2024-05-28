public class demo01 {
    public static void main(String[] args) {
//        String str1 = "hello";
//        String str2 = "hello";

//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
//        String str3 = "Hello";
//        System.out.println(str1 == str3);
//
//        String str4 = str3.toLowerCase();
//        System.out.println(str1 == str4);
//
//        System.out.println(str1.equals(str4));
//
//        System.out.println(str1.equalsIgnoreCase(str3));

        String str = "suhua is a good boy!";
        System.out.println(str.contains("!"));

        System.out.println(str.indexOf("!"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.length());
        System.out.println(str.toCharArray());
        System.out.println(str.startsWith("suhua"));
        System.out.println(str.endsWith("is"));
        System.out.println(str.substring(2, 5));
    }
}
