package basicjavacode;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find odd or even");
        int a = sc.nextInt();

        //Using Bitwise Operator
        //& 1 checks the last binary digit.
        if ((a & 1) == 0) {
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }

        //Using logic
        if ((a / 2) * 2 == a) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
