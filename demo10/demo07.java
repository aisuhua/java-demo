import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class demo {
    public static void main(String[] args) {

    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;
        if ((person.name == null && this.name == null) {

        }

        return this.name.equals(person.name) && this.age == person.age;
    }
}