import java.util.Scanner;

public class ManualArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) {
            return;
        }

        String[] values = line.split("\\s+");
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}
