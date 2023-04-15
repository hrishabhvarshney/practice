/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5   */
import java.util.Scanner;
public class pattern_question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row = in.nextInt();
        System.out.print("Enter no. of cols: ");
        int col = in.nextInt();
        pattern4(row, col);
    }
    static void pattern4(int r, int c){
        for (int row = 0; row <= r; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
