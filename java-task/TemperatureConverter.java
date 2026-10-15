import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double temperature;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                temperature = sc.nextDouble();

                result = (temperature * 9.0 / 5.0) + 32;

                System.out.println("Fahrenheit: " + result);
                break;

            case 2:
                System.out.print("Enter Fahrenheit: ");
                temperature = sc.nextDouble();

                result = (temperature - 32) * 5.0 / 9.0;

                System.out.println("Celsius: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}