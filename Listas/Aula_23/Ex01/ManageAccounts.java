import java.util.ArrayList;

/**
 * This class manager all the Bank Accounts added. 
 *
 * @author Rayan Avelino
 * @version 21.10.2017
 */
public class ManageAccounts{
	
	private ArrayList<BankAccount> accounts;

	/**
	 * Creates a Bank Account.
	 */
	public ManageAccounts(){
		accounts = new ArrayList<BankAccount>();
	}

	/**
	 * Adds a valid account.
	 * @param account - The account to be added.
	 */
	public void storeAccount(BankAccount account){
		accounts.add(account);
	}

	/**
	 * Removes a valid account.
	 * @param account - The account to be removed.
	 */
	public void removeAccount(int accountNumber){

		for(BankAccount c : accounts){
			if(c.getAccount() == accountNumber){
				accounts.remove(c);
				return;
			}
		}
		System.out.println("Account not found");

	}

	/**
	 * Does a deposit in a account.
	 * @param accountNumber - The account number. 
	 * @param value - The value to be deposited.
	 */
	public void depositAccount(int accountNumber, double value){

		try{

			for(BankAccount c : accounts){
				if(c.getAccount() == accountNumber){
					c.deposit(value);
				}
			}

		}catch(ParameterException ex){
			System.out.println(ex.getMessage());
		}

	}

	/**
	 * Does a withdraw in a account.
	 * @param accountNumber - The account number. 
	 * @param value - The value to be withdrawn.
	 */
	public void withdrawAccount(int accountNumber, double value){

		try{

			for(BankAccount c : accounts){
				if(c.getAccount() == accountNumber){
					c.withdraw(value);
				}
			}

		}catch(ParameterException ex){
			System.out.println(ex.getMessage());
		}

	}

	/**
	 * Prints the statement of an account.
	 * @param accountNumber - The account number.
	 */
	public void statementAccount(int accountNumber){

		for(BankAccount c : accounts){
			if(c.getAccount() == accountNumber){
				c.statement();
			}
		}

	}

}