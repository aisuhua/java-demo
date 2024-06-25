import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class demo01 {
    public static void main(String[] args) {
        try {
            Person person = Person.class.newInstance();
            person.sayhello();

            Constructor const1 = Integer.class.getConstructor(int.class);
            Integer i1 = (Integer) const1.newInstance(100);
            System.out.println(i1);

            Constructor const2 = Integer.class.getConstructor(String.class);
            Integer i2 = (Integer) const2.newInstance("12313");
            System.out.println(i2);
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