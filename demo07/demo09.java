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