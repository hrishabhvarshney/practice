import java.util.Scanner;

public class adding_in_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of element in array");
        int n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value: ");
            a[i]=s.nextInt();
        }
        System.out.println("Enter index of new value to inserted ");
        int m = s.nextInt();
        System.out.println("Enter value to be inserted");
        int p = s.nextInt();
        for (int i = 0; i < n+1; i++) { // 10 20 30 40 50
             if (i<m){                  // 10 20 80 40 50
                 b[i] = a[i];
             } else if (i==m) {
                b[i] = p;
             }else{
                 b[i] = a[i-1];
             }
        }
        System.out.println("Element are:");
        for (int i = 0; i < n+1; i++) {
            System.out.println(b[i]);
        }
    }
}
