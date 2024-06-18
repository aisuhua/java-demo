
public class demo03 {
    public static void main(String[] args) {
        Test t = new Test();
        t.setAge(100);
        System.out.println(t.getAge());
    }
}

class Test {
    private int age = 0;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}