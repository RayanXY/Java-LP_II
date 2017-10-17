public class Test{

	public static void main(String [] args){

		Calculator calculator = new Calculator();

		String exp1 = "15-3";
		String exp2 = "1a5-3";
		String exp3 = "15-3b";
		String exp4 = "15b3";
		String exp5 = "15/0";

		if(calculator.validateExpression(exp1)){
			System.out.println(calculator.solving());
		}else{
			System.out.println("Could not calculate");
		}

	}

}

		/*
		int i = 0;
		String expression = "6a0/0";

		/// Op1
		String op1 = "";
		while(i < expression.length()){
			if(Character.isDigit( expression.charAt(i) ) ){
				op1 += Character.toString(expression.charAt(i));
				i++;
			}else{
				break;
			}
		}

		System.out.println("First operand: " + op1);
		System.out.println("Paused at: " + i);

		/// Operator
		int oprtr = 0;
		String operator = Character.toString(expression.charAt(i));
		if(operator.equals("+")){
			oprtr = 1;
			i++;
		}else if(operator.equals("-")){
			oprtr = 2;
			i++;
		}else if(operator.equals("*")){
			oprtr = 3;
			i++;
		}else if(operator.equals("/")){
			oprtr = 4;
			i++;
		}

		System.out.println("Operator Position: " + oprtr);
		System.out.println("Operator: " + operator);
		System.out.println("Paused at: " + i);

		/// Op2
		String op2 = "";
		while(i < expression.length()){
		 	if(Character.isDigit( expression.charAt(i))){
				op2 += Character.toString(expression.charAt(i));
				i++;
			}else{
				break;
			}
		}

		System.out.println("Second operand: " + op2);
		System.out.println("Paused at: " + (i));

		float a, b, result;
		a = Float.parseFloat(op1);
		b = Float.parseFloat(op2);

		result = 0;
		if(oprtr == 1){
			result = a + b;
		}else if(oprtr == 2){
			result = a - b;
		}else if(oprtr == 3){
			result = a * b;
		}else if(oprtr == 4){
			if(b == 0){
				System.out.println("Could not calculate");
			}else{
				result = a / b;
			}
		}

		System.out.println("Result: " + result);

	}
	*/