import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int sum = 0;
        int arr[] = new int[11];
        for (int i = 0; i < a; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Sum is : " +sum);
    }
}
