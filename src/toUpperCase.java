import java.util.Scanner;

public class toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.toUpperCase();
        System.out.println("Orginal string: " + s1);
        System.out.println("UpperCase String: " + s2);

    }
}
