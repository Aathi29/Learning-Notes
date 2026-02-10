
import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check vowels and consonants: ");
        String a = sc.nextLine();
        String b = a.toLowerCase();
        int v = 0, c = 0;
        for (char ch : b.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
