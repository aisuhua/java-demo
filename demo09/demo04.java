import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String[] arr = {"f", "e", "c", "d", "b", "a"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.toString());

        Person[] persons = new Person[] {
                new Person("a", 2),
                new Person("c", 3),
                new Person("b", 4),
        };

        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
