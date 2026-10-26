import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        int[] frequencies = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < first.length(); i++) {
            char character = first.charAt(i);
            if (!Character.isWhitespace(character)) {
                frequencies[Character.toLowerCase(character)]++;
            }
        }
        for (int i = 0; i < second.length(); i++) {
            char character = second.charAt(i);
            if (!Character.isWhitespace(character)) {
                frequencies[Character.toLowerCase(character)]--;
            }
        }

        boolean anagrams = true;
        for (int frequency : frequencies) {
            if (frequency != 0) {
                anagrams = false;
                break;
            }
        }
        System.out.println(anagrams ? "The strings are anagrams." : "The strings are not anagrams.");
    }
}
