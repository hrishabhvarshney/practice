import java.util.Scanner;

public class swap_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("before swap a is equal to " + a);
        System.out.println("before swap b is equal to " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap a is equal to " + a);
        System.out.println("After swap b is equal to " + b);
    }
}
