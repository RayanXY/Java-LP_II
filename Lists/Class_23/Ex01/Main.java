public class Main{

	public static void main(String [] args){
		
		/// Accounts.
		BankAccount marioAccount = new BankAccount("Mario", 1, 1000.00);
		BankAccount luigiAccount = new BankAccount("Luigi", 2, 1.00);

		/// Storing the Accounts.
		ManageAccounts accounts = new ManageAccounts();
		accounts.storeAccount(marioAccount);
		accounts.storeAccount(luigiAccount);

		/// Exception Errors.
		accounts.withdrawAccount(2, 5.00);
		accounts.depositAccount(2, -3.00);

		/// Functions
		accounts.withdrawAccount(1, 5.00);
		accounts.depositAccount(1, 2500.00);
		accounts.removeAccount(2);
		accounts.statementAccount(1);

	}

}