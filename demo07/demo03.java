class demo01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class cls = String.class;
        String str = (String) cls.newInstance();
        System.out.println(str);
    }
}