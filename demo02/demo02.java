public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "suhua";
        person.age = 18;
        System.out.println(person.toString());
    }
}

class Person {
    private String name;
    private int age;
    }
}