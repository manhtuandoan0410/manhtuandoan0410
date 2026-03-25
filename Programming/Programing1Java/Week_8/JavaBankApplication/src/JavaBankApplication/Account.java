package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields

	// Constructor

	// Methods
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
}
// End