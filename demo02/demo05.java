import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String str = "suhua";
        Person person = new Person();
        person.setName(str);
        System.out.println(person.getName());
        str = "google";
        System.out.println(person.getName());
    }
}

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}