class demo01 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class cls = Student.class;
        System.out.println(cls.getField("name"));
        System.out.println(cls.getDeclaredField("age"));
    }
}

class Person {
    public String name = "";
}

class Student extends Person {
    public String nickname = "";
    private int age = 0;
}