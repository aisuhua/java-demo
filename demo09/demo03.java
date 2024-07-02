import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(new Object());
        String str = (java.lang.String) list.get(1);
        System.out.println(list.get(1).getClass());
        System.out.println(str.length());
    }
}