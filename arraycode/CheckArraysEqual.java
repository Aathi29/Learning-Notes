package arraycode;

import java.util.Scanner;

public class CheckArraysEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the array numbers: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isEqual = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
