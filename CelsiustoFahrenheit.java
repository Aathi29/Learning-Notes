
import java.util.Scanner;

public class CelsiustoFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius");
        double a = sc.nextInt();
        double b = (a * 9 / 5) + 32;
        System.out.println(b);
    }
}
