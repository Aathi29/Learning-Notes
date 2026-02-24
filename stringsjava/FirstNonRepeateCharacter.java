package stringsjava;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeateCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = sc.nextLine();
        String str = a.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeated
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeated character found");
    }
}
