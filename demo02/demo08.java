public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.run();
    }
}

class Person {
    public void run() {
        System.out.println("run1");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("run2");
    }
}
