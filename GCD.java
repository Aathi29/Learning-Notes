
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        //a = 48, b = 18
        //temp = 18
        //b = 3
        //a = 18

        //temp = 3
        //b = 6
        //a = 3
        //temp = 6
        //b = 1/2
        // a = 6
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}
