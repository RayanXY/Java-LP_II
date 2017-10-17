public class Calculator{

	private int i, operatorSignal;
	private String op1, op2, operator;
	private float a, b, result;

	public Calculator(){

		i = 0;
		operatorSignal = 0;
		op1 = "";
		op2 = "";
		operator = "";
		a = 0;
		b = 0;
		result = 0;

	}

	public boolean isOperator(String operator){

		if(operator.equals("+")){
			operatorSignal = 1;
			return true;
		}else if(operator.equals("-")){
			operatorSignal = 2;
			return true;
		}else if(operator.equals("*")){
			operatorSignal = 3;
			return true;
		}else if(operator.equals("/")){
			operatorSignal = 4;
			return true;
		}else{
			return false;
		}

	}
	
	public boolean validateExpression(String expression){

		int size = expression.length();

		/// First part	
		while(i < size){
			if(Character.isDigit(expression.charAt(i))){
				op1 += Character.toString(expression.charAt(i));
				i++;
			}else if(isOperator(Character.toString(expression.charAt(i)))){
				i++;
				break;
			}else{
				return false;
			}
		}

		/// Second part
		while(i < size){
		 	if(Character.isDigit(expression.charAt(i))){
				op2 += Character.toString(expression.charAt(i));
				i++;
			}else{
				return false;
			}
		}

		/// In case of division
		if(operatorSignal == 4){
			float divider = Float.parseFloat(op2);
			if(divider == 0){
				return false;
			}
		}

		return true;

	}

	public void calculate(String expression){

		if(validateExpression(expression)){

			a = Float.parseFloat(op1);
			b = Float.parseFloat(op2);

			if(operatorSignal == 1){
				result = a + b;
			}else if(operatorSignal == 2){
				result = a - b;
			}else if(operatorSignal == 3){
				result = a * b;
			}else if(operatorSignal == 4){
				result = a / b;
			}

			System.out.println(result);

		}else{
			System.out.println("Could not calculate");
		}


	}

}