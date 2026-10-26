import java.util.Scanner;

public class ArrayRightRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        if (line.regionMatches(true, 0, "Array:", 0, 6)) {
            line = line.substring(6).trim();
        }
        String rotationLine = scanner.nextLine().trim();
        if (rotationLine.regionMatches(true, 0, "K:", 0, 2)) {
            rotationLine = rotationLine.substring(2).trim();
        }
        int rotation = Integer.parseInt(rotationLine);
        if (line.isEmpty()) {
            System.out.println();
            return;
        }

        String[] values = line.split("\\s+");
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }

        int shift = ((rotation % numbers.length) + numbers.length) % numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[(i - shift + numbers.length) % numbers.length]);
        }
        System.out.println();
    }
}
