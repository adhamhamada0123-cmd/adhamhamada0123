//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("----- Bank Account Simulator -----");

        while (true) {
            System.out.println("__________________________________");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                input.next();
                continue;
            }

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(input.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(input.nextDouble());
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    account.showSummary();
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 4.");
            }
        }
    }
}