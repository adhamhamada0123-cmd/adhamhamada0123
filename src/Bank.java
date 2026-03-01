import java.util.Scanner;

class BankAccountSimulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numOfTransactions = 0;
        double withdraw;
        int choice;
        double balance = 0;
        double amount = 0;

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

            choice = input.nextInt();

            if (choice > 4 || choice <= 0) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = input.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid amount.");
                        break;
                    }

                    balance += amount;
                    numOfTransactions++;
                    System.out.printf("Deposit successful. Current balance: %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = input.nextDouble();

                    if (withdraw > balance || withdraw <= 0) {
                        System.out.println("Error: Insufficient balance. Withdrawal failed.");
                    } else {
                        balance -= withdraw;
                        numOfTransactions++;
                        System.out.printf("Withdrawal successful. Current balance: %.2f%n", balance);
                    }
                    break;

                case 3:
                    System.out.printf("Your current balance is: %.2f%n", balance);
                    break;

                case 4:
                    System.out.println("_____________________________________");
                    System.out.println("Exiting...");
                    System.out.println("Total transactions performed: " + numOfTransactions);
                    System.out.printf("Final balance: %.2f%n", balance);
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 4.");
            }
        }
    }
}

