/**
 * This class represents an rectangle form and extends from Rectangle class 
 * inheriting its functions and attributes, with its height and widht as parameters. 
 *
 * @author Rayan Avelino
 * @version 23.09.2017
 */
public class Square extends Rectangle{

	private float side;
	
	/**
 	 * Creates a square.
 	 * @param side - Rectangle's sides.
 	 */
	public Square(float side){

		super(side, side);
		this.side = side;

	}

	/**
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> Square's Area: " + calculateArea() + "\n>>> Square's Perimeter: " + calculatePerimeter();
	}

}