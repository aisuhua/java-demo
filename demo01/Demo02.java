import java.util.Scanner;
class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = sc.nextLine();
        System.out.println("Input your age: ");
        int age = sc.nextInt();
        System.out.printf("Hi, %s, you are %d\n", name, age);
    }
}
