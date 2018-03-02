import java.lang.Math;

/**
 * This class represents an circle form and extends from Forms class, with its sides as parameters. 
 *
 * @author Rayan Avelino
 * @version 23.09.2017
 */
public class Circle extends Forms{
	
	private float radius;
	private float pi = (float) Math.PI;

	/**
 	 * Creates a rectangle.
 	 * @param height - Rectangle's height.
 	 * @param width = Rectangle's width.
 	 */
	public Circle(float radius){

		this.radius = radius;
	}

	/**
	 * @return The radius of the circle.
	 */
	public float getRadius(){
		return radius;
	}

	/**
	 * @return The area of the circle.
	 */
	public float calculateArea(){
		float area = pi * (radius*radius);
		return area;
	}

	/**
	 * @return The perimeter of the circle.
	 */
	public float calculatePerimeter(){
		float perimeter = 2 * pi * radius;
		return perimeter;
	}

	/**
	 * @return A string representation of the object.
	 */
	public String toString(){
		return ">>> Circle's Area: " + calculateArea() + "\n>>> Circle's Perimeter: " + calculatePerimeter();
	}

}