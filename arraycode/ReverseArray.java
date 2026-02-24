package arraycode;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter the array numbers");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
