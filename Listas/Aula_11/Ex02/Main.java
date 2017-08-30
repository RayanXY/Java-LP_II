public class Main{

	public static void main(String [] args){
	
		SavingsAccount Save_account = new SavingsAccount("Mario", 1, 1000.0, 7);
		SpecialAccount Spec_account = new SpecialAccount("Luigi", 2, 500.0, 150);
		
		Bank bb = new Bank();
		
		bb.addAccount(Save_account);
		bb.addAccount(Spec_account);
		
		bb.bankCashOut(Spec_account, 200.0);
		bb.bankNewBalance(Save_account, 0.1);
		
		bb.printAccounts();
	
	}

}
