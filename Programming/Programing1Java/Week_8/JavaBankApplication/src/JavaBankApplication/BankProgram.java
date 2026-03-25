package JavaBankApplication;

// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.util.ArrayList;

public class BankProgram {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | " +
						 "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");

		if (accountList.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (Account acc : accountList) {
            System.out.println("Number: " + acc.getAccountNumber() +
                               " | Balance: " + String.format("%.2f euros", acc.getBalance()));
        }
	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		System.out.print("Enter account number: ");
        String accNum = input.nextLine().trim();

        // Check duplicate
        if (findAccount(accNum) != null) {
            System.out.println("Account not created. Account " + accNum + " exists already!");
            return;
        }

        // Create new account (balance always starts at 0)
        Account newAcc = new Account(accNum);
        accountList.add(newAcc);
        System.out.println("Account created successfully!");
	}

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		 for (Account acc : accountList) {
        if (acc.getAccountNumber().equals(accountNumber)) {
            return acc;   // Found it!
        }
    }
    return null;  // Not found
}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.print("Enter account number: ");
        String accNum = input.nextLine().trim();

        Account account = findAccount(accNum);

        if (account == null) {
            System.out.println("Account " + accNum + " does not exist!");
            return;
        }

        System.out.print("Enter the amount to be deposited: ");
        double amount = Double.parseDouble(input.nextLine());

        if (amount < 0) {
            System.out.println("Cannot deposit a negative amount!");
            return;
        }

        account.deposit(amount);
        System.out.println("Deposit completed successfully!");
	}

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.print("Enter account number: ");
        String accNum = input.nextLine().trim();

        Account account = findAccount(accNum);

        if (account == null) {
            System.out.println("Account " + accNum + " does not exist!");
            return;
        }

        System.out.print("Enter the amount to be withdrawn: ");
        double amount = Double.parseDouble(input.nextLine());

        if (amount < 0) {
            System.out.println("Cannot withdraw a negative amount!");
            return;
        }

        boolean ok = account.withdraw(amount);

        if (ok) {
            System.out.println("Withdrawal completed successfully!");
        } else {
            System.out.println("Withdrawal not completed. Available balance is too low.");
        }
	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.print("Enter account number: ");
        String accNum = input.nextLine().trim();

        Account account = findAccount(accNum);

        if (account == null) {
            System.out.println("Nothing deleted. Account " + accNum + " does not exist!");
            return;
        }

        accountList.remove(account);
        System.out.println("Account deleted successfully!");
	}
}
// End
