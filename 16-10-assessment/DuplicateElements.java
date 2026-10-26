import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("Duplicate elements:");
            return;
        }

        String[] values = line.split("\\s+");
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        boolean[] printed = new boolean[numbers.length];
        StringBuilder result = new StringBuilder("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++) {
            if (printed[i]) {
                continue;
            }
            boolean duplicate = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    printed[j] = true;
                }
            }
            if (duplicate) {
                result.append(' ').append(numbers[i]);
            }
        }
        System.out.println(result);
    }
}
