public class Main {
    public static void main(String[] args) {
        Test.print();
        System.out.println(Test.name);

        Test test = new Test();
        test.print();
        System.out.println(test.name);
    }
}

class Test {
    public static String name = "abc";

    public static void print() {
        System.out.println(Test.name);
    }
}

public interface Person {
    public static final int AGE = 100;
    public static final String NAME = "suhua";
}