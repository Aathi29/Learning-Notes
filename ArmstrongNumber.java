
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Check for single digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong or not");
        int a = sc.nextInt();
        int b = a;
        int rev = 0;
        while (b > 0) {
            int temp = b % 10;
            rev = rev + (temp * temp * temp);
            b = b / 10;
        }
        if (rev == a) {
            System.out.println(a + " is an armstrong number");
        } else {
            System.out.println(a + " is not an armstrong number");
        }

        //Checks for first n Armstrong number
        System.out.println("Enter the number to check armstrong or not");
        int c = sc.nextInt();
        int count = 0;
        int num = 1;
        while (count < c) {
            if (armstrongNumbet(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        sc.close();
    }

    public static boolean armstrongNumbet(int c) {
        int d = c;
        int r = 0;
        while (d > 0) {
            int temp = d % 10;
            r = r + (temp * temp * temp);
            d = d / 10;
        }
        return r == c;
    }
}
