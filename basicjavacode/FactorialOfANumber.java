package basicjavacode;

import java.util.Scanner;

public class FactorialOfANumber {

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int a = sc.nextInt();
        int fact = 1;

        //Iterative approach
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Iterative approach: " + fact);

        //Recursive approach
        System.out.println("Factorial = " + factorial(a));
    }
}
