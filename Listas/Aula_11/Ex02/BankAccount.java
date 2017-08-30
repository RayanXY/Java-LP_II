/**
 * This class represents a Bank Account. Its attributes are the client 
 * who owns the account, the account number and its balance. 
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class BankAccount{

	private String client;			//!< Client who owns the account.
	private int account_number;		//!< The account number.
	private double balance;			//!< The current balance.
	
	/**
	 * Creates a client.
	 * @param client - Client who owns the account.
	 * @param account_number - The account number.
	 * @param balance - The current balance.
	 */
	public BankAccount(String client, int account_number, double balance){
	
		this.client = client;
		this.account_number = account_number;
		if(balance > 0.0){
			this.balance = balance;
		}else{
			this.balance = 0.0;
			System.out.println("Wrong balance value inserted. Balance is $ 0.0!");
		}
	
	}
	
	/**
	 * @return The client's name.
	 */
	public String getClient(){
		return client;
	}
	
	/**
	 * @return The account number.
	 */
	public int getAccount_number(){
		return account_number;
	}
	
	/**
	 * @return The current balance.
	 */
	public double getBalance(){
		return balance;
	}
	
	/**
	 * Sets a client for the account.
	 * @param client - Client who owns the account.
	 */
	public void setClient(String client){
		this.client = client;
	}
	
	/**
	 * Sets a account number for account.
	 * @param account_number - The account number.
	 */
	public void setAccount_number(int account_number){
		this.account_number = account_number;
	}
	
	/**
	 * Sets a balance for the account.
	 * @param balance - The current balance.
	 */
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	/**
	 * Makes an account withdrawal.
	 * @param cash - The amount to be cash out.
	 */
	public void cashOut(double cash){
		if(cash <= 0){
			System.out.println("Please insert a valid number.");
		}else if(cash > balance){
			System.out.println("Insufficient balance.");
		}else{
			balance = balance - cash;
		}
	}
	
	/**
	 * @override
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> BANK ACCOUNT\n> Client: " + this.client + "\n> Account Number: " + this.account_number + "\n> Balance: " + this.balance;
	}

}
