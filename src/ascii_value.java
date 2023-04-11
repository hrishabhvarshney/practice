import java.util.Scanner;

public class ascii_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = ch;
        //int castAscii = (int) ch;
        System.out.println("The Ascii Value of "+ ch + "is: " + ascii);

    }
}
