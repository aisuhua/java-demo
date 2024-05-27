public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }
}

abstract class Person {
    public abstract void show();
}

class Student extends Person {
    public void show() {

    }
}