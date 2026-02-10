
import java.util.Scanner;

public class StringReverse {

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
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
}
