import java.util.Stack;

/**
 * This class represents a calculator. It implements
 * the Calculable inteface inheriting its funtions.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Calculator implements Calculable{
	
	private Stack<Float> history;

	/// Creates a calculator
	public Calculator(){

		history = new Stack<Float>();

	}

	/**
	 * Adds two numbers, and stores its result.
	 * @param num_1 - The first factor.
	 * @param num_2 - The second factor.
	 * @return result - The result of the operation.
	 */
	public float sum(float num_1, float num_2){
		float result = num_1 + num_2;
		history.push(result);
		return result;
	}

	/**
	 * Subtracts two numbers, and stores its result.
	 * @param num_1 - The first factor.
	 * @param num_2 - The second factor.
	 * @return result - The result of the operation.
	 */
	public float subtract(float num_1, float num_2){
		float result = num_1 - num_2;
		history.push(result);
		return result;
	}

	/**
	 * Multiplies two numbers, and stores its result.
	 * @param num_1 - The first factor.
	 * @param num_2 - The second factor.
	 * @return result - The result of the operation.
	 */
	public float multiply(float num_1, float num_2){
		float result = num_1 * num_2;
		history.push(result);
		return result;
	}

	/**
	 * Divides two numbers, and stores its result.
	 * @param num_1 - The first factor.
	 * @param num_2 - The second factor.
	 * @return result - The result of the operation.
	 */
	public float divide(float num_1, float num_2){
		float result = num_1 / num_2;
		history.push(result);
		return result;
	}

	/// Shows all the results stored.
	public void history(){
		if(history.isEmpty()){
			System.out.println("No history!");
		}else{
			for(float stack : history){
				System.out.println(stack);
			}
		}
	}

}