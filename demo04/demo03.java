import java.util.StringJoiner;

public class demo03 {
    public static void main(String[] args) {
//        String str = "suhua is a good boy.";
//        System.out.println(str.split(" "));
//
//        for (String value : str.split(" ")) {
//            System.out.println(value);
//        }
//
//        String arr[] = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        String[] arr = {"A", "B", "C"};
//        System.out.println(String.join(",", arr));
//
//        String str = "%s is a good boy, he is %d years old.";
//        System.out.println(str.formatted("Suhua", Integer.parseInt("100")));
//
//        System.out.println(String.format(str, "Suhua", 100));
//
//        Boolean b1 = Boolean.parseBoolean("true");
//        Boolean b2 = Boolean.parseBoolean("FLASE");
//        System.out.println(b1);
//        System.out.println(b2);
//
//        System.out.println(Integer.getInteger("java.version"));
//
//        char[] arr2 = "Hello".toCharArray();
//        String str2 = new String(arr2);
//        System.out.println(arr2);
//        System.out.println(str2);

//        String s = "";
//        for (int i = 0; i < 100; i++) {
//            s = s + "," + i;
//        }
//        System.out.println(s);
//
//        StringBuilder sb = new StringBuilder(1024);
//        for (int i = 0; i < 100; i++) {
//            sb.append(",");
//            sb.append(i);
//        }
//        System.out.println(sb.toString());

//        StringBuilder sb = new StringBuilder(1024);
//        sb.append("is ")
//                .append("a ")
//                .append("good ")
//                .append("boy. ")
//                .insert(0, "Suhua ");
//        System.out.println(sb.toString());

        String[] arr = {"Baidu", "Google", "Youtube"};
        var str = new StringBuilder();
        str.append("Hello ");

        for (String s : arr) {
            str.append(s);
            str.append(",");
        }

        str.delete(str.length() - 1, str.length());
        str.append(" !");
        System.out.println(str);

        var str2 = new StringJoiner(",", "Hello ", " !");
        for (String s : arr) {
            str2.add(s);
        }
        System.out.println(str2.toString());

    }
}
