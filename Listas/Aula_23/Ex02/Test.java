public class Test{

	public static void main(String [] args){

		int i = 0;
		String expression = "18*20";

		/// Op1
		String op1 = "";
		while( Character.isDigit( expression.charAt(i) ) ){
			op1 += Character.toString(expression.charAt(i));
			i++;
		}

		System.out.println("First operand: " + op1);
		System.out.println("Paused at: " + i);

		/// Operator
		int oprtr = 0;
		String operator = Character.toString(expression.charAt(i));
		if(operator.equals("+")){
			oprtr = i;
			i++;
		}else if(operator.equals("-")){
			oprtr = i;
			i++;
		}else if(operator.equals("*")){
			oprtr = i;
			i++;
		}else if(operator.equals("/")){
			oprtr = i;
			i++;
		}

		System.out.println("Operator: " + operator);
		System.out.println("Paused at: " + i);

		/// Op2
		String op2 = "";
		while( Character.isDigit( expression.charAt(i-1) )){
			op2 += Character.toString(expression.charAt(i-1));
			i++;
		}

		System.out.println("Second operand: " + op2);
		System.out.println("Paused at: " + (i));

		//float result = Float.parseFloat(currentLetter);
		/*
		String a = "1";
		System.out.println(a);

		a += "b";
		System.out.println(a);
		*/
	}

}