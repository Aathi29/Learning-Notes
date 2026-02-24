package basicjavacode;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci");
        int a = sc.nextInt();
        //0,1,1,2,3,5,8
        int f1 = 0;
        int f2 = 1;
        int f3;
        for (int i = 1; i <= a; i++) {
            System.out.print(f1 + " ");
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
    }
}
