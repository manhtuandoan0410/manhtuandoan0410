package JavaBankApplication;

//public class Account {
//	
//	private String accountNumber;
//	private double balance;
//	
//	public Account(String accountNumber, double balance) {
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//	}
//	
//	public void deposit(double amount) {
//		this.balance += amount;
//	}
//	
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//	
//	public double getBalance() {
//		return balance;
//	}
//	
//	public void withdraw(double amount) {
//		this.balance -= amount;
//		
//	}
//}

public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

//    @Override
//    public String toString() {
//        return "Number: " + accountNumber + " | Balance: " + String.format("%.2f euros", balance);
//    }
}
