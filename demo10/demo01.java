import java.util.List;
import java.util.ArrayList;

class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1, "d");
        list.add(null);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<String> list1 = List.of("a", "b", "c");
        System.out.println(list1.size());
    }
}