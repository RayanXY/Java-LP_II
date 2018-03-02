import java.util.ArrayList;

/**
 * This class represents a Bank. Its store the types of accounts.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class Bank{

	private ArrayList<BankAccount> accounts;	//!< Where the accounts will be stored.
	
	/**
	 * Creates a bank.
	 */
	public Bank(){
	
		accounts = new ArrayList<BankAccount>();
	
	}
	
	/**
	 * Calculates the new balance after the income day.
	 * @param account - The account that will be used.
	 * @param rate_of_return - The rate of return to add to be add to the balance.
	 */
	public void bankNewBalance(SavingsAccount account, double rate_of_return){
		account.newBalance(rate_of_return);
	}
	
	/**
	 * Makes an account withdrawal.
	 * @param account - The account that will be used.
	 * @param cash - The amount to be cash out.
	 */
	public void bankCashOut(SpecialAccount account, double cash){
		account.cashOut(cash);
	}
	
	/**
	 * Adds an account to the bank.
	 * @param account - The account the will be added.
	 */
	public void addAccount(BankAccount account){
		accounts.add(account);
	}
	
	/**
	 * Prints all the stored account.
	 */
	public void printAccounts(){
		for(BankAccount account : accounts){
			System.out.println(account);
			System.out.println();
		}
	}

}
