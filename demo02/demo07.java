
public class Main {
    public static void main(String[] args) {
        Student student = new Student("suhua", 30, 100);
        Person person = new Student("abc", 20, 100);
        Object obj = person;
        Person p1 = new Person("google", 20);
        Student s = (Student) person;
        //Student s2 = (Student) p1;

        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(p1 instanceof Student);
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}