import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Objects;

class demo {
    public static void main(String[] args) {
        Person person1 = new Person("a", 30);
        Person person2 = new Person("b", 31);
        System.out.println(person1.equals(person2));

        List<Person> list = List.of(person1, person2);
        System.out.println(list.contains(new Person("a", 30)));
        System.out.println(list.indexOf(new Person("b", 31)));

    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 覆写 equals 方法，判断引用对象是否相等
    // 可用于 List contains 和 indexOf 方法判断
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;
//        if ((person.name == null && this.name == null) ||
//            this.name != null && this.name.equals(person.name)
//        ) {
//            if (this.age == person.age) {
//                return true;
//            }
//        }

//        return false;

        return Objects.equals(this.name, person.name) && age == person.age;
    }
}