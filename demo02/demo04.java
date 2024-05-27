import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[] {"suhua", "baidu"};
        Person person = new Person();
        person.setNames(arr);
        System.out.println(person.getNames());
        arr[0] = "google";
        System.out.println(person.getNames());
    }
}

class Person {
    public String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    public String getNames()
    {
        return names[0] + " " + names[1];
    }
}