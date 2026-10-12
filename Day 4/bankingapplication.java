import java.util.Scanner;

class atm {
    private final int id;
    private int balance;

    public atm(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void getter() {
        System.out.println("ATM ID: " + id);
        System.out.println("ATM balance: " + balance);
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a deposit amount greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Enter a withdrawal amount greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        }
    }
}

public class bankingapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atm firstAccount = new atm(1, 1000);
        atm secondAccount = new atm(2, 2000);
        boolean running = true;

        while (running) {
            System.out.print("Enter your ATM ID (1 or 2): ");
            int accountId = sc.nextInt();
            atm selectedAccount;
            if (accountId == 1) {
                selectedAccount = firstAccount;
            } else if (accountId == 2) {
                selectedAccount = secondAccount;
            } else {
                System.out.println("Unknown ATM ID.");
                continue;
            }

            System.out.print("Choose 1 to withdraw, 2 to deposit, or 3 to check balance: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    selectedAccount.withdraw(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    selectedAccount.deposit(sc.nextInt());
                    break;
                case 3:
                    selectedAccount.getter();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Enter 1 to continue or 2 to exit: ");
            running = sc.nextInt() == 1;
        }

        sc.close();
    }
}
