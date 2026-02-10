
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        int a = sc.nextInt();
        int original = a;
        int rev = 0;
        while (original > 0) {
            int temp = original % 10;
            rev = rev * 10 + temp;
            original = original / 10;
        }
        if (a == rev) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
