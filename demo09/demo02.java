import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Integer i = list.get(0);
        System.out.println(i);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        // list2.add(1);
        String str = list2.get(0);
        System.out.println(str);

        List<String> list3 = new ArrayList<>();
        list3.add("a");
        System.out.println(list3.get(0));
    }
}