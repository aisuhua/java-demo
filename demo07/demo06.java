import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;

class demo01 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class stdClass = Student.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));



        Method method = stdClass.getMethod("getScore", String.class);
        System.out.println(method.getName());
        System.out.println(method.getReturnType());
        System.out.println(method.getParameterTypes());

        for (Class cls: method.getParameterTypes()) {
            System.out.println(cls.getName());
        }

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