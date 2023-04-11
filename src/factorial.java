import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static long factorial(int a){
        if (a == 1 || a == 0) {
            return (1);
        }else {
            return (a * factorial(a-1));
        }
    }
}
