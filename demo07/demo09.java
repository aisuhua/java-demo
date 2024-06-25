import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class demo01 {
    public static void main(String[] args) {
        try {
            Class cls = Integer.class;
            Class n = cls.getSuperclass();
            System.out.println(n);
            Class n2 = n.getSuperclass();
            System.out.println(n2);
            Class n3 = n2.getSuperclass();
            System.out.println(n3);

            Class[] cs = cls.getInterfaces();
            for (Class c : cs) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}

class Person {
    public void sayhello() {
        System.out.println("hello");
    }
}