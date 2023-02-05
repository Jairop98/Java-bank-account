package bank;

public class Account {
	private double checking;
	private double savings; 
	public static int numOfAccounts = 0;
	public static double money = 0;
	
	public Account() {
		Account.numOfAccounts += 1;
		this.checking = 0;
		this.savings = 0;
	}
	public void depositMoney(double amount, String account) {
		if (account == "checking") {
			this.checking += amount;	
		}
		else {
			this.savings += amount;
		}
		this.money += amount;
	}
	
	public void withdrawMoney(double amount, String account) {
		if (account == "checking") {
			if(amount > this.checking)	{
				System.out.println("Insufficient Funds");
				return;
			}
			this.checking -= amount;
		}
		else {
			if(amount > this.savings) {
				System.out.println("Insufficient Funds");
				return;
			}
			this.savings -= amount;
		}
	}
	public double getCheckingBalance() {
		return this.checking;
	}
	public double getSavingsBalance() {
		return this.savings;
	}
}