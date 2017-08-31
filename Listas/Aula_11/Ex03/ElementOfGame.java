/**
 * This class represents an Element in the game. Its attributes 
 * are the row and column, representing the position of the element.
 * 
 * @author Rayan Avelino
 * @version 30.08.2017
 */
public class ElementOfGame{

	private int row;		//!< Row where the element is.
	private int column;		//!< Column whre the element is.
	
	/**
	 * Creates an element for the game.
	 * @param row - Row where the element is.
	 * @param column - Column whre the element is.
	 */
	public ElementOfGame(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	/**
	 * @return The row whre the element is.
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * @return The column whre the element is.
	 */
	public int getColumn(){
		return column;
	}
	
	/**
	 * Sets a position for the element.
	 * @param row - Row where the element is.
	 * @param column - Column whre the element is.
	 */
	public void setPosition(int row, int column){
		this.row = row;
		this.column = column;
	}
}
