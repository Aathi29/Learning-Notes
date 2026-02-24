package arraycode;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array numbers");
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        int average = sum / 5;
        System.out.println(average);
    }
}
