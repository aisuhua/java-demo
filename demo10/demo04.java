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
        // 方式1：会丢失类型信息
        Object[] arr = list.toArray();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        
        for (Object o : arr) {
            System.out.println(o.getClass());
        }

        // 方式2：使用带类型的数组让 list 填充
        Integer[] arr2 = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2);

        // 方式3：使用函数式写法 new Integer[]::new
        Integer[] arr3 = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3);

        // array 转 list
        Integer[] arr4 = {1, 2, 3};
        List list2 = List.of(arr4);
        System.out.println(list2);
        System.out.println(list2.getClass());

        // Error
        ArrayList<Integer> list3 = List.of(arr4);
        System.out.println(list3);
    }
}