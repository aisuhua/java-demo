public class Main {
    public static void main(String[] args) {
        Person p = new Person("suhua", 100);
        p.printinfo();
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printinfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}