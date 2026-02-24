package array;

import java.util.Scanner;

public class CopyOnetoAnother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array number");
        int[] a = new int[6];
        int[] b = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(b[i]);
        }
    }
}
