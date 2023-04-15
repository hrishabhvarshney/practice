/*
 *
 * *
 * * *
 * * * *
 * * * * *    */
import java.util.Scanner;
public class pattern_question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = in.nextInt();
        System.out.print("Enter no. of cols: ");
        int col = in.nextInt();
        pattern2(row, col);
    }
    static void pattern2(int r, int c){
        for (int row = 1; row <= r; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
