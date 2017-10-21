/**
 * This class represents a simple Bank Account. 
 *
 * @author Rayan Avelino
 * @version 21.10.2017
 */
public class BankAccount{
	
	private String name;
	private int account;
	private double balance;

	/**
	 * Creates a Bank Account.
	 * @param name - The person's name.
	 * @param account - The account number.
	 * @param initial_balance - The initial balance of the account.
	 */
	public BankAccount(String name, int account, double initial_balance){

		this.name = name;
		this.account = account;
		balance = initial_balance;

	}

	/**
	 * @return The account number.
	 */
	public int getAccount(){
		return account;
	}

	/**
	 * Prints the statement.
	 */
	public void statement(){

		System.out.println(">>> BANK STATEMENT");
		System.out.println("> Name: " + name);
		System.out.println("> Account: " + account);
		System.out.println("> Current Balance: $" + balance);

	}

	/**
	 * Withdraws money.
	 * @param value - The value to be withdrawn.
	 * @throws ParameterException if the value is bigger than the current balance or is a negative number.
	 */
	public void withdraw(double value) throws ParameterException{

		if(value < 0){
			throw new ParameterException(">>> Invalid parameter: Negative Value.");
		}else if(value > balance){
			throw new ParameterException(">>> Invalid parameter: Value is grater than the available balance.");
		}else{
			balance -= value;
			System.out.println("> Withdrawn: " + value);
			System.out.println("> New balance: $" + balance);
		}

	}

	/**
	 * Does a deposit.
	 * @param value - The value to be deposited.
	 * @throws ParameterException if the value is a negative number.
	 */
	public void deposit(double value) throws ParameterException{

		if(value < 0){
			throw new ParameterException(">>> Invalid parameter: Negative Value.");
		}else{
			balance += value;
			System.out.println("> Deposited: " + value);
			System.out.println("> New balance: $" + balance);
		}

	}

}