import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int[] frequencies = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < value.length(); i++) {
            frequencies[value.charAt(i)]++;
        }
        for (int i = 0; i < value.length(); i++) {
            if (frequencies[value.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + value.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}
