import java.util.Scanner;

public class stringContainsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the String: ");
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' ||a.charAt(i) == 'i' ||a.charAt(i) == 'o' ||a.charAt(i) == 'u')
                System.out.println("Given string contain " + a.charAt(i) +  " at the index" + i);
        }
    }
}
