import java.util.Scanner;

public class check_primeno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int a){
        if(a == 0 || a == 1){
            return false;
        }
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <a/2; i++) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}

