public class BankAccount {

    private double balance;
    private int numOfTransactions;

    public BankAccount() {
        balance = 0;
        numOfTransactions = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        balance += amount;
        numOfTransactions++;
        System.out.printf("Deposit successful. Current balance: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("Error: Insufficient balance. Withdrawal failed.");
            return;
        }

        balance -= amount;
        numOfTransactions++;
        System.out.printf("Withdrawal successful. Current balance: %.2f%n", balance);
    }

    public void checkBalance() {
        System.out.printf("Your current balance is: %.2f%n", balance);
    }

    public void showSummary() {
        System.out.println("Total transactions performed: " + numOfTransactions);
        System.out.printf("Final balance: %.2f%n", balance);
    }
}