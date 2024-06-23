import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class demo01 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class cls = Student.class;
        System.out.println(cls.getField("name"));
        System.out.println(cls.getDeclaredField("age"));

        Field f = cls.getDeclaredField("age");
        System.out.println(f.getName());
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isPublic(m));
    }
}

class Person {
    public String name = "";
}

class Student extends Person {
    public String nickname = "";
    private int age = 0;
}