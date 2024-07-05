import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class demo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        for (Integer i : list) {
            System.out.println(i);
        }

        // 迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}