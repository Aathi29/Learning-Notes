package stringsjava;

import java.util.HashMap;
import java.util.Scanner;

public class ConcurrenceEachCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
