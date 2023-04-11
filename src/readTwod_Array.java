import java.util.Scanner;
public class readTwod_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int b = sc.nextInt();
        int arr[][] = new int [11][10];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                    System.out.print("Enter the value: ");
                    arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix - A: ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}


