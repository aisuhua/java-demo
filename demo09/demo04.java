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
                new Person("a", 10),
                new Person("c", 3),
                new Person("b", 4),
        };

        Arrays.sort(persons);
        for (Person person : persons) {
            System.out.println(person.name);
        }
    }
}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public int compareTo(Person person) {
//        return this.name.compareTo(person.name);
//    }

    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
