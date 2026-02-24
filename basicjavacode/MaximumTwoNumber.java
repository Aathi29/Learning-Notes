package basicjavacode;

import java.util.Scanner;

public class MaximumTwoNumber {

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Maximum of two numbers " + maximum(a, b));
    }
}
