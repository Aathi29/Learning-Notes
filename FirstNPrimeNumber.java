
import java.util.Scanner;

public class FirstNPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print n prime number");
        int a = sc.nextInt();
        System.out.println("Enter the n number");
        int n = 2;
        int count = 0;
        while (count < a) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
