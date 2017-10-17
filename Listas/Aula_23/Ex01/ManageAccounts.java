import java.util.ArrayList;

public class ManageAccounts{
	
	private ArrayList<BankAccount> accounts;

	public ManageAccounts(){
		accounts = new ArrayList<BankAccount>();
	}

	public void storeAccount(BankAccount account){
		accounts.add(account);
	}

	public void removeAccount(int accountNumber){

		for(BankAccount c : accounts){
			if(c.getAccount() == accountNumber){
				accounts.remove(c);
				return;
			}
		}
		System.out.println("Account not found");

	}

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

	public void statementAccount(int accountNumber){

		for(BankAccount c : accounts){
			if(c.getAccount() == accountNumber){
				c.statement();
			}
		}

	}

}