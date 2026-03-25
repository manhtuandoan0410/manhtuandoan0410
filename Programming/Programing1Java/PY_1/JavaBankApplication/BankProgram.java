package JavaBankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankProgram {
	private ArrayList<Account> accountList;
	Scanner input = new Scanner(System.in);
		
	public BankProgram() {
		accountList = new ArrayList<Account>();
	}
	
	private Account findAccount(String accountNumber) {
		for (Account acc : accountList) {
			if (acc.getAccountNumber().equals(accountNumber)) {
				return acc;
			}
		}
		return null;
	}
	
	private void listAccount() {
		if (accountList.isEmpty() ) {
			System.out.println("No account found.");
			return;
		}
		
		for (Account acc : accountList) {
			System.out.println(acc);
		}
	}
	
	private void deleteAccount() {
		System.out.print("Enter account number: ");
		String accNum = input.nextLine().trim();
		
		Account account = findAccount(accNum);
		
		if (account == null) {
			System.out.println("Nothing deleted. Account " + accNum + " does not exist!");
			return;
		}
		
		accountList.remove(account);
		System.out.println("Account deleted successfully");
//		if (account != null) {
//			accountList.remove(account);
//			System.out.println("Account deleted successfully");
//		} else {
//			System.out.println("Nothing deleted. Account " + accNum + " does not exist!");
//		}
	}
	
	private void addAccount() {
		System.out.print("Enter account number: ");
		String accNum = input.nextLine().trim();
		
		//check for duplicate
		if (findAccount(accNum) != null) {
			System.out.println("Account not created. Account " + accNum + " exists already!");
			return;
		}
		
		//create new account with startingbalance 0.0 (already stated in Account class)
		Account newAccount = new Account(accNum);
		accountList.add(newAccount);
		System.out.println("Account created successfully");
//		boolean exists = false;
//		
//		for (Account acc : accountList) {
//			if (acc.getAccountNumber().equals(accNum)) {
//				exists = true;
//				break;
//			}
//		}
		
//		if (exists) {
//			System.out.println("Account not created. Account " + accNum + " exists already!");
//			
//		} else {
//			double startingBalance = 0.00;
//			Account account = new Account(accNum, startingBalance);
//			accountList.add(account);
//			System.out.println("Account created successfully!");
//		}
	}
	
	private void depositMoney() {
		System.out.print("Enter account number: ");
		String accNum = input.nextLine().trim();
		
//		Account account = null;
//		
//		for (Account acc : accountList) {
//			if (acc.getAccountNumber().equals(accNum)) {
//				account = acc;
//				break;
//			}
//		}
//		
//		if (account != null) {  
//	        System.out.print("Enter the amount to be deposited: ");
//	        double amount = Double.parseDouble(input.nextLine());
//	        if (amount < 0) {
//	        	System.out.println("Cannot deposit a negative amount!");
//	        } else {
//	        account.deposit(amount); 
//	        System.out.println("Deposit completed successfully!");
//	        }
//	    } else {
//	        System.out.println("Account " + accNum + " does not exist");
//	    }
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
	
	private void withdrawMoney() {
		System.out.print("Enter account number: ");
		String accNum = input.nextLine().trim();
		
		Account account = findAccount(accNum);
		if (account == null) {
			System.out.println("Account " + accNum + " does not exists!");
			return;
		}
		
		System.out.println("Enter the amount to be withdrawn: ");
		double amount = Double.parseDouble(input.nextLine());
			if (amount < 0) {
				System.out.println("Cannot withdraw a negative amount!");
				return;
			}
			boolean success = account.withdraw(amount);
			
			if (success) {
				System.out.println("Withdrawal completed successfully!");
			} else {
				System.out.println("Withdrawl not completed. Available balance is too low.");
			}
			}
		
//		Account account = null; 
//		
//		for (Account acc : accountList) {
//			if (acc.getAccountNumber().equals(accNum)) {
//				account = acc;
//				break;
//			}
//		}
//		if (account != null) {  
//	        System.out.print("Enter the amount to be withdrawn: ");
//	        double amount = Double.parseDouble(input.nextLine());
//	        if (amount < 0) {
//	        	System.out.println("Cannot withdraw a negative amount");
//	        }
//	        if (amount < account.getBalance() ) {
//	        account.withdraw(amount); 
//	        System.out.println("Withdrawal completed successfully!");
//	        } else {
//	        	System.out.println("Withdrawal not completed. Available balance is too low.");
//	        }
//	    } else {
//	        System.out.println("Account " + accNum + " does not exist");
//	    }
//	}
	}

