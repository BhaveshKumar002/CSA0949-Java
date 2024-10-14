import java.util.Scanner;

class BankAccount {
    String depositorName;
    String accountNumber;
    String accountType;
    double balance;

    BankAccount(String name, String number, String type) {
        this.depositorName = name;
        this.accountNumber = number;
        this.accountType = type;
        this.balance = 500.00; // Minimum balance
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("John Doe", "123456", "Savings");
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Current balance: " + account.getBalance());
    }
}
