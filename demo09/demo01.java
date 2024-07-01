import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        alist.add("suhua");
        alist.add(111);

        System.out.println(alist.get(0));
        System.out.println(alist.get(1));

        String str = (String) alist.get(0);
        System.out.println(str.length());
    }
}