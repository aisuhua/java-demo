import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Objects;

class demo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("suhua", 100),
            new Student("baidu", 200),
            new Student("zhangsan", 300)
        );

        String myname = "baidu";
        for (Student student : students) {
            if (myname.equals(student.name)) {
                System.out.println(student.age);
            }
        }
    }
}

class Student {
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}