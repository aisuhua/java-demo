import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNames("suhua");
        System.out.println(Arrays.toString(person.names));
        person.setNames("suhua", "baidu", "google");
        System.out.println(Arrays.toString(person.names));
        person.setNames();
        System.out.println(Arrays.toString(person.names));
        person.setNames(null);
        System.out.println(Arrays.toString(person.names));
    }
}

class Person {
    public String[] names;

    public void setNames(String... names) {
        this.names = names;
    }
}