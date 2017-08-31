/**
 * This class represents the map for the game. It also informs the position 
 * of the elements that are placed in the game, add other elements, verifies 
 * and allowed elements be moved and starts fights.
 */
public class Map{

	private ElementOfGame [][] map;		//!< Represents the map.
	
	/**
	 * Creates a map for the game.
	 * @param size - The size of the map.
	 */
	public Map(int size){
	
		map = new ElementOfGame[size][size];
	
	}
	
	/**
	 * @param row - Row where the element is.
	 * @param column - Column whre the element is.
	 * @return The element in the specified positon.
	 */
	public ElementOfGame getPosition(int row, int column){
		return map[row][column];
	}
	
	/**
	 * Add elements in the map.
	 * @param row - Row whre the element is.
	 * @param column - Column whre the element is.
	 * @param element - The element to be added.
	 */
	public void addElement(int row, int column, ElementOfGame element){
		element.setPosition(row, column);
		map[row][column] = element;
	}
	
	/**
	 * return If the position is occupied by another element.
	 */
	public boolean isOccupiedByCastle(int row, int column){
		ElementOfGame element = map[row][column];
		if(element instanceof Castle || element instanceof Characters){
			return true;
		}else{
			return false;
		}
	}
	
	//TO DO
	/*
	public isOccoupiedByEnemy(int row, int column){
	
	}
	
	public void fight(ElementOfGame attacking, ElementOfGame defending){
		System.out.prinln(attacking.getHp());
	}
	*/
	
	/**
	 * Move the character specified arround the map.
	 * @param element - The element to be moved.
	 * @param row - Row whre the element is.
	 * @param column - Column whre the element is.
	 * @param size - The size of map.
	 */
	public void moveCharacter(ElementOfGame element, int row, int column, int size){
		if(element instanceof Characters){
			if(row >= size || row < 0 || column >= size || column < 0 || isOccupiedByCastle(row, column)){
				System.out.println("Invalid move!");				
			}else{
				/// Erasing the previous position.
				map[element.getRow()][element.getColumn()] = null;
				/// Placing the character in the new position.
				map[row][column] = element;
				/// Setting the new location for the character.
				element.setPosition(row, column);
			}
		}
	}

}
