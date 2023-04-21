import java.util.*;
public class remove_space_fromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "     Geeks     for Geeks     ";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
    }

