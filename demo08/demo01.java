public class demo {
    public static void main(String[] args) {
        Person person = new Person();
    }
}

class Person {
    @Check(min=0, max=100, value=55)
    public int age;

    public void getAge() {

    }

}