package arraycode;

import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        int counte = 0;
        int counto = 0;
        for (int i = 0; i < 6; i++) {
            if (a[i] % 2 == 0) {
                counte++;
            } else {
                counto++;
            }
        }
        System.out.println("Even count " + counte);
        System.out.println("Odd count " + counto);
    }
}
