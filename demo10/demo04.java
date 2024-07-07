import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class demo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        System.out.println(list);
        System.out.println(list.getClass());

        // list 转 array
        Object[] arr = list.toArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        
        for (Object o : arr) {
            System.out.println(o.getClass());
        }

        Integer[] arr2 = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2);
    }
}