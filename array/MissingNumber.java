package array;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array numbers: ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int expectedSum = (max - min + 1) * (min + max) / 2;

        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}
