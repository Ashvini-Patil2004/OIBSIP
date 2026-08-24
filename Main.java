import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        ArrayList<Transaction> transactions = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("        WELCOME TO ATM");
        System.out.println("=================================");

        // Login
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        Account account = bank.login(userId, pin);

        if (account == null) {
            System.out.println("\nInvalid User ID or PIN!");
            System.out.println("Thank you for using ATM.");
            scanner.close();
            return;
        }

        System.out.println("\nLogin Successful!");
        System.out.println("Welcome, " + account.getUserId() + "!");

        // ATM Menu
        while (true) {

            System.out.println("\n=================================");
            System.out.println("           ATM MENU");
            System.out.println("=================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nCurrent Balance: ₹"
                            + account.getBalance());

                    break;

                case 2:

                    System.out.print("\nEnter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {

                        System.out.println("Invalid amount!");

                    } else {

                        account.deposit(depositAmount);

                        transactions.add(
                                new Transaction(
                                        "DEPOSIT",
                                        depositAmount,
                                        "Money deposited successfully"
                                )
                        );

                        System.out.println(
                                "₹" + depositAmount
                                        + " deposited successfully."
                        );

                        System.out.println(
                                "New Balance: ₹"
                                        + account.getBalance()
                        );
                    }

                    break;

                case 3:

                    System.out.print("\nEnter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount <= 0) {

                        System.out.println("Invalid amount!");

                    } else if (!account.withdraw(withdrawAmount)) {

                        System.out.println("Insufficient balance!");

                        System.out.println(
                                "Current Balance: ₹"
                                        + account.getBalance()
                        );

                    } else {

                        transactions.add(
                                new Transaction(
                                        "WITHDRAW",
                                        withdrawAmount,
                                        "Money withdrawn successfully"
                                )
                        );

                        System.out.println(
                                "₹" + withdrawAmount
                                        + " withdrawn successfully."
                        );

                        System.out.println(
                                "Remaining Balance: ₹"
                                        + account.getBalance()
                        );
                    }

                    break;

                case 4:

                    System.out.println("\n=================================");
                    System.out.println("       TRANSACTION HISTORY");
                    System.out.println("=================================");

                    if (transactions.isEmpty()) {

                        System.out.println(
                                "No transactions available."
                        );

                    } else {

                        for (Transaction transaction : transactions) {
                            System.out.println(transaction);
                        }
                    }

                    break;

                case 5:

                    System.out.println("\n=================================");
                    System.out.println("     Thank you for using ATM!");
                    System.out.println("        Have a nice day!");
                    System.out.println("=================================");

                    scanner.close();
                    return;

                default:

                    System.out.println(
                            "\nInvalid choice! Please try again."
                    );
            }
        }
    }
}