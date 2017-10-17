public class Calculator{

	private int i, operatorSignal;
	private String op1, op2, operator;
	private float a, b, result;

	/// Checks the character is an operator
	public boolean isOperator(String operator){

		operatorSignal = 0;

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
	
	/// Validates the expression
	public boolean validateExpression(String expression){

		i = 0;
		int size = expression.length();

		/// If it is a blank line
		if(expression.isEmpty()){
			return false;
		}

		/// First part	
		op1 = "";
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
		op2 = "";
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

	public float calculate(){

		a = 0;
		b = 0;
		result = 0;

		/// Converting the parts of the expression
		a = Float.parseFloat(op1);
		b = Float.parseFloat(op2);

		/// Finding the operation to be calculated
		if(operatorSignal == 1){
			result = a + b;
		}else if(operatorSignal == 2){
			result = a - b;
		}else if(operatorSignal == 3){
			result = a * b;
		}else if(operatorSignal == 4){
			result = a / b;
		}

		return result;

	}

}