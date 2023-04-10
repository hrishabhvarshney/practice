import java.util.Scanner;
public class Fibonacci_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fibonacci(a);
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " , ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}

