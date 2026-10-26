import java.util.HashSet;

public class HashSetDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40, 50, 30};
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Number of unique elements: " + uniqueNumbers.size());
        System.out.println("Contains 40: " + uniqueNumbers.contains(40));
        System.out.println("HashSet does not guarantee iteration order; its displayed order may vary.");
    }
}
