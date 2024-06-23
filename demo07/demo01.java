class demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls = String.class;
        System.out.println(cls);

        String str = new String("hello");
        System.out.println(str.getClass());

        Class cls2 = Class.forName("java.lang.String");
        System.out.println(cls2);

        System.out.println(cls == cls2);
    }
}