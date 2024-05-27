
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.toString());
        Person person2 = new Person("suhua", 100);
        System.out.println(person2.toString());
        Person person3 = new Person("baidu");
        System.out.println(person3.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 10);
    }

    public Person() {
        this("unNamed");
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}