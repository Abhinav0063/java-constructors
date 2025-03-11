class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New Balance: $" + balance);
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("\n🏦 Savings Account:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456789", "Alice", 5000);
        acc1.deposit(200);
        System.out.println("Balance: $" + acc1.getBalance());

        SavingsAccount sav1 = new SavingsAccount("987654321", "Bob", 3000);
        sav1.displayAccountDetails();
    }
}
