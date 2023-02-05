package bank;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.depositMoney(234, "checking");
		account1.depositMoney(1000, "savings");
		account1.withdrawMoney(200, "checking");
		account1.withdrawMoney(750, "savings");

        Account account2 = new Account();
		account2.depositMoney(649, "checking");
		account2.depositMoney(987, "savings");
		account2.withdrawMoney(340, "checking");
		
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());
         
	}

}
