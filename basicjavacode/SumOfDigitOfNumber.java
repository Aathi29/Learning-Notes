package basicjavacode;

import java.util.Scanner;

public class SumOfDigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of digit");
        int a = sc.nextInt();
        int temp = 0;
        int add = 0;
        while (a > 0) {
            temp = a % 10;
            add = add + temp;
            a = a / 10;
        }
        System.out.println("Sum of Digit of number is " + add);
    }
}
