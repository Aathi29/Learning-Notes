package arraycode;

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array elements");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}
