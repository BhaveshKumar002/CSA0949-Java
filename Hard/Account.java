class Customer {
    private String accountNo;
    private String accName;
    private double balance = 10000;

    synchronized void withdraw(double amount) throws InterruptedException {
        while (amount > balance) {
            System.out.println("Insufficient balance, waiting for deposit...");
            wait();
        }
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount: " + balance);
    }

    synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        notifyAll();
    }
}

class BankOperations implements Runnable {
    private Customer customer;
    private double amount;

    BankOperations(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void run() {
        if (amount < 0) {
            try {
                customer.withdraw(-amount);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            customer.deposit(amount);
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Thread withdrawThread = new Thread(new BankOperations(customer, 12000));
        Thread depositThread = new Thread(new BankOperations(customer, 3000));

        withdrawThread.start();
        depositThread.start();

        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
