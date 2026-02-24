package basicjava;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        String b = a.toLowerCase();
        for (int i : b.toCharArray()) {
            if (b.charAt(i) == b.charAt(i + 1)) {
                System.out.println("i");
            }
        }
    }
}
