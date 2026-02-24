package arraycode;

import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array number");
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i]);
            }
        }
    }
}
