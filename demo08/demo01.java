public class demo {
    public static void main(String[] args) {
        Person person = new Person();
    }
}

class Me {
    public void getAge() {

    }
}


class Person extends Me {
    //@Check(min=0, max=100, value=55)
    @Check
    public int age;

    @Override
    public void getAge() {

    }

}