
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count the digit");
        int a = sc.nextInt();
        int temp = 0;
        int count = 0;
        while (a > 0) {
            temp = a % 10;
            count++;
            a = a / 10;
        }
        System.out.println(count);
    }
}
