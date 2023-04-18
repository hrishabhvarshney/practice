import java.util.Scanner;
public class use_of_capacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("java is a programming language" );
        System.out.println(" capacity = " + sb.capacity());
        System.out.println(" capacity = " + sb1.capacity());
    }
}
