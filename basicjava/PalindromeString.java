package basicjava;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String a = sc.nextLine();
        String rev = "";

        //Using backward traversal
        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }
        System.out.println("Using backward traversal " + rev);

        //Using StringBuilder
        String reversed = new StringBuilder(a).reverse().toString();
        System.out.println("Using StringBuilder " + reversed);

        //Using two-pointer array
        char[] arr = a.toCharArray();

        int start = 0;
        int end = a.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
