public class ArmstrongNumbers {
    public static void main(String[] args) {
        boolean first = true;

        for (int number = 1; number <= 1000; number++) {
            int digits = 0;
            int copy = number;
            while (copy > 0) {
                digits++;
                copy /= 10;
            }

            int sum = 0;
            copy = number;
            while (copy > 0) {
                int digit = copy % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
                copy /= 10;
            }

            if (sum == number) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(number);
                first = false;
            }
        }
        System.out.println();
    }
}
