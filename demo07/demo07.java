import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;

class demo01 {
    public static void main(String[] args) {
        try {
            String s = "Hello World";
            Method method = String.class.getMethod("substring", int.class);
            String str = (String) method.invoke(s, 5);
            System.out.println(str);

            Method method2 = Integer.class.getMethod("parseInt", String.class);
            Integer i = (Integer) method2.invoke(null, "12313");
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}