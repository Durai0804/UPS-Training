class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class BankWithdrawalExceptionDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Available balance: " + account.getBalance());
        }
    }
}
