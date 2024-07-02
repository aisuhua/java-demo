import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(new Object());
        System.out.println(list.get(1));
    }
}