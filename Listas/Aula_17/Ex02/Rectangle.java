/**
 * This class represents an rectangle form and extends from Forms class, with its height and widht as parameters. 
 *
 * @author Rayan Avelino
 * @version 23.09.2017
 */
public class Rectangle extends Forms{
	
	private float height, width;

	/**
 	 * Creates a rectangle.
 	 * @param height - Rectangle's height.
 	 * @param width = Rectangle's width.
 	 */
	public Rectangle(float height, float width){

		this.height = height;
		this.width = width;

	}

	/**
	 * @return The height of the rectangle.
	 */
	public float getHeight(){
		return height;
	}

	/**
	 * @return The width of the rectangle.
	 */
	public float getWidth(){
		return width;
	}

	/**
	 * @return The area of the rectangle.
	 */
	public float calculateArea(){
		float area = height * width;
		return area;
	}

	/**
	 * @return The height of the rectangle.
	 */
	public float calculatePerimeter(){
		float perimeter = 2*(height + width); 
		return perimeter;
	}

	/**
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> Rectangle's Area: " + calculateArea() + "\n>>> Rectangle's Perimeter: " + calculatePerimeter();
	}

}