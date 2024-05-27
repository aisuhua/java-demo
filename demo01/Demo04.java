
class Demo04 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
            if (arg.equals("--version")) {
                System.out.println("v 1.0");
            }
        }
    }
}
