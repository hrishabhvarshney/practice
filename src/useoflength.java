import java.util.Scanner;

public class useoflength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First add some characters...");
        char ch[] = s.next().toCharArray();
        String s1 = new String (ch);
        System.out.println(" String = " + s1);
        System.out.println(" length = " + s1.length());
        System.out.println(" Length = " + "Java Programming Examples".length() );

    }
}
