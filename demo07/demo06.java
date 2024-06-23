import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class demo01 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class stdClass = Student.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}

class Person {
    public String getName() {
        return "Person";
    }
}

class Student extends Person {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}