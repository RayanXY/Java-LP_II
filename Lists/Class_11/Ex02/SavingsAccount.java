/**
 * This class represents a Savings Account. It is an extension
 * of the Client class, inheriting its attributes and adding
 * the income day.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class SavingsAccount extends BankAccount{

	private int income_day; 	//!< The day that will happen the income.
	
	/**
	 * Creates a client.
	 * @param client - Client who owns the account.
	 * @param account_number - The account number.
	 * @param balance - The current balance.
	 * @param income_day - The day that will happen the income.
	 */
	public SavingsAccount(String client, int account_number, double balance, int income_day){
	
		super(client, account_number, balance);
		if(income_day >= 1 && income_day <= 31){
			this.income_day = income_day;
		}else{
			this.income_day = 1;
			System.out.println("Invalid day inserted. Income day is on 1th");
		}
	
	}
	
	/**
	 * @return The income day.
	 */
	public int getIncome_day(){
		return income_day;
	}
	
	/**
	 * Sets the income day.
	 * @param income_day - The day that will happen the income.
	 */
	public void setIncome_day(int income_day){
		if(income_day >= 1 || income_day <= 31){
			this.income_day = income_day;
		}else{
			System.out.println("Invalid day inserted!");
		}
	}
	
	/**
	 * Calculates the new balance after the income day.
	 * @param rate_of_return - The rate of return to add to be add to the balance.
	 */
	public void newBalance(double rate_of_return){
		double income = getBalance() * rate_of_return;
		double new_balance = getBalance() + income;
		setBalance(new_balance);
	}
	
	/**
	 * @override
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> SAVINGS ACCOUNT\n> Client: " + getClient() + "\n> Account Number: " + getAccount_number() +"\n> Balance: " + getBalance() + "\n> Income Day: " + income_day;
	}

}
