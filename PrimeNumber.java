
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime number");
        int a = sc.nextInt();
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
