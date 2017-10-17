public class BankAccount{
	
	private String name;
	private int account;
	private double balance;

	public BankAccount(String name, int account, double initial_balance){

		this.name = name;
		this.account = account;
		balance = initial_balance;

	}

	public int getAccount(){
		return account;
	}

	public void statement(){

		System.out.println(">>> BANK STATEMENT");
		System.out.println("> Name: " + name);
		System.out.println("> Account: " + account);
		System.out.println("> Current Balance: $" + balance);

	}

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