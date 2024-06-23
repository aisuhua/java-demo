import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class demo01 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Object obj = new Person("suhua");
        Class cls = obj.getClass();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(obj);
        System.out.println(value);

        f.set(obj, "baidu");
        value = f.get(obj);
        System.out.println(value);
    }
}

class Person {
    private String name = "";

    public Person(String name) {
        this.name = name;
    }
}