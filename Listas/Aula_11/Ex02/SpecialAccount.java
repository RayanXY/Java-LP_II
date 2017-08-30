/**
 * This class represents a Savings Account. It is an extension
 * of the Client class, inheriting its attributes and adding
 * the income day.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class SpecialAccount extends BankAccount{

	private double limit;	  //!< The limit of balance for the account.

	/**
	 * Creates a client.
	 * @param client - Client who owns the account.
	 * @param account_number - The account number.
	 * @param balance - The current balance.
	 * @param limit - The limit of balance for the account.
	 */
	public SpecialAccount(String client, int account_number, double balance, double limit){
	
		super(client, account_number, balance);
		this.limit = limit;
	
	}
	
	/**
	 * @return The limit of balance for the account.
	 */
	public double getLimit(){
		return limit;
	}
	
	/**
	 * Sets the limit of balance for the account.
	 * @param limit - The limit of balance for the account.
	 */
	public void setLimit(double limit){
		this.limit = limit;
	}
	
	/**
	 * @override
	 * Makes an account withdrawal.
	 * @param cash - The amount to be cash out.
	 */
	public void cashOut(double cash){
		if(cash <= 0){
			System.out.println("Please insert a valid number.");
		}else if((getBalance() - cash) < (-1 * limit)){
			System.out.println("Insufficient balance.");
		}else{
			double new_balance = getBalance() - cash;
			setBalance(new_balance);
		}
	}
	
	/**
	 * @override
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> SPECIAL ACCOUNT\n> Client: " + getClient() + "\n> Account Number: " + getAccount_number() +"\n> Balance: " + getBalance() + "\n> Limit: " + -1 * limit;
	}

}
