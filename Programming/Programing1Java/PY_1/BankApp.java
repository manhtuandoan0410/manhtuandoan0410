import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

    // ------------------------------
    // CLASS: BankAccount
    // ------------------------------
    static class BankAccount {
        private String accountNumber;
        private String owner;
        private double balance;

        public BankAccount(String accountNumber, String owner, double initialBalance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = initialBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Deposit must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal must be positive.");
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
            }
        }

        @Override
        public String toString() {
            return accountNumber + " | " + owner + " | Balance: " + balance;
        }
    }

    // ------------------------------
    // CLASS: Bank (manages accounts)
    // ------------------------------
    static class Bank {
        private ArrayList<BankAccount> accounts = new ArrayList<>();

        public void addAccount(BankAccount acc) {
            accounts.add(acc);
        }

        public BankAccount findAccount(String accountNumber) {
            for (BankAccount acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    return acc;
                }
            }
            return null;
        }

        public void transfer(String from, String to, double amount) {
            BankAccount a = findAccount(from);
            BankAccount b = findAccount(to);

            if (a == null || b == null) {
                System.out.println("One or both accounts not found.");
                return;
            }

            if (amount <= 0) {
                System.out.println("Transfer amount must be positive.");
                return;
            }

            if (a.getBalance() < amount) {
                System.out.println("Insufficient funds.");
                return;
            }

            a.withdraw(amount);
            b.deposit(amount);
            System.out.println("Transfer successful.");
        }

        public void listAccounts() {
            if (accounts.isEmpty()) {
                System.out.println("No accounts created yet.");
                return;
            }
            for (BankAccount acc : accounts) {
                System.out.println(acc);
            }
        }
    }

    // ------------------------------
    // MAIN PROGRAM
    // ------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== BANK MENU ===");
            System.out.println("1) Create account");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Transfer");
            System.out.println("5) List accounts");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Account number: ");
                    String accNum = sc.nextLine();

                    System.out.print("Owner name: ");
                    String owner = sc.nextLine();

                    System.out.print("Initial balance: ");
                    double bal = Double.parseDouble(sc.nextLine());

                    bank.addAccount(new BankAccount(accNum, owner, bal));
                    System.out.println("Account created.");
                    break;

                case "2":
                    System.out.print("Account number: ");
                    String depAcc = sc.nextLine();

                    BankAccount dep = bank.findAccount(depAcc);
                    if (dep == null) {
                        System.out.println("Account not found.");
                        break;
                    }

                    System.out.print("Amount: ");
                    double depAmount = Double.parseDouble(sc.nextLine());
                    dep.deposit(depAmount);
                    break;

                case "3":
                    System.out.print("Account number: ");
                    String wAcc = sc.nextLine();

                    BankAccount w = bank.findAccount(wAcc);
                    if (w == null) {
                        System.out.println("Account not found.");
                        break;
                    }

                    System.out.print("Amount: ");
                    double wAmount = Double.parseDouble(sc.nextLine());
                    w.withdraw(wAmount);
                    break;

                case "4":
                    System.out.print("From account: ");
                    String from = sc.nextLine();

                    System.out.print("To account: ");
                    String to = sc.nextLine();

                    System.out.print("Amount: ");
                    double tAmount = Double.parseDouble(sc.nextLine());

                    bank.transfer(from, to, tAmount);
                    break;

                case "5":
                    bank.listAccounts();
                    break;

                case "0":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
