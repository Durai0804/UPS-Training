public class SecondLargestDistinct {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 45, 32, 18};
        Integer largest = null;
        Integer secondLargest = null;

        for (int number : numbers) {
            if (largest == null || number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number != largest && (secondLargest == null || number > secondLargest)) {
                secondLargest = number;
            }
        }

        if (secondLargest == null) {
            System.out.println("No second-largest distinct element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
