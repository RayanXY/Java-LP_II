import java.util.Scanner;

public class Main{
	
	public static void main(String [] args){

		int operation;
		float num_1, num_2;
		boolean loop = true;

		Calculator calculator = new Calculator();
		Scanner read = new Scanner(System.in);

		/** 
		 * A loop to test the calculator as many times as we want. 
		 * Only exiting when the History is shown or Exit is selected.
		 */
		while(loop){
			
			System.out.println(">>> CALCULATOR <<<");
			System.out.println("1 - Sum");
			System.out.println("2 - Subtract");
			System.out.println("3 - Multiply");
			System.out.println("4 - Divide");
			System.out.println("5 - History");
			System.out.println("0 - Exit");
			System.out.print("Operation: ");
			operation = read.nextInt();

			switch(operation){

				case 1:		//!< Sum.
					System.out.println("First Number:");
					num_1 = read.nextFloat();
					System.out.println("Second Number:");
					num_2 = read.nextFloat();
					calculator.sum(num_1, num_2);
					break;
				case 2:		//!< Subtract.
					System.out.println("First Number:");
					num_1 = read.nextFloat();
					System.out.println("Second Number:");
					num_2 = read.nextFloat();
					calculator.subtract(num_1, num_2);
					break;
				case 3:		//!< Multiply.
					System.out.println("First Number:");
					num_1 = read.nextFloat();
					System.out.println("Second Number:");
					num_2 = read.nextFloat();
					calculator.multiply(num_1, num_2);
					break;
				case 4:		//!< Divide.
					System.out.println("First Number:");
					num_1 = read.nextFloat();
					System.out.println("Second Number:");
					num_2 = read.nextFloat();
					calculator.divide(num_1, num_2);
					break;
				case 5:		//!< History.
					calculator.history();
					loop = false;
					break;
				case 0:		//!< Exit.
					loop = false;
					break;
			}

		}

	}

}