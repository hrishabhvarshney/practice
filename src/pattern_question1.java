/*
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *   */
import java.util.Scanner;
public class pattern_question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = in.nextInt();
        System.out.print("Enter no. of cols: ");
        int col = in.nextInt();
        pattern1(row,col);
    }
    public static void pattern1(int r, int c){
        for (int row = 1; row <= r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
