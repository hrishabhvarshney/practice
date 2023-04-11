import java.util.Locale;
import java.util.Scanner;

public class toLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase(Locale.ROOT);
        System.out.println("Orginal string: " + s1);
        System.out.println("LowerCase String: " + s2);
    }
}
