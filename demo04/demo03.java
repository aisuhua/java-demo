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

        String arr[] = {"A", "B", "C"};
        System.out.println(String.join(",", arr));

        String str = "%s is a good boy, he is %d years old.";
        System.out.println(str.formatted("Suhua", Integer.parseInt("100")));

        System.out.println(String.format(str, "Suhua", 100));
    }
}
