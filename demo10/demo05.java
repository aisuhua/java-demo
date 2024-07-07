import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class demo {
    public static void main(String[] args) {
        // list 实例化方式
        // List<String> list = List.of("A", "B", "C");
        //
        // String[] arr = {"A", "B", "C"};
        // String[] arr = new String[]{"A", "B", "C"};

//        String[] arr = new String[3];
//        arr[0] = "A";
//        arr[1] = "B";
//        arr[2] = "C";
//        System.out.println(Arrays.toString(arr));

        // List<String> newList = Arrays.asList(arr);
        List<String> list = List.of(new String[]{"A", "B", "C"});
        System.out.println(list.contains("A"));
        System.out.println(list.contains("B"));
        System.out.println(list.indexOf("C"));

    }
}