/**
 * Utilizamos a ArrayList para facilitar o alocamento dinâmico.
 */
import java.util.ArrayList;

public class Node{

	private Node father;
	private ArrayList<Node> sons;
	private String value;
	private Character key;
	
	public Node( String value, Character key){
		
		father = null;
		sons = new ArrayList<Node>();
		this.value = value;
		this.key = key;
		
	}
	
	public void setFather( Node father )
	{
		this.father = father;
	}
	
	public String getValue() {
		return value;
	}
	
	public Character getKey() {
		return key;
	}
	
	public Node getFather() {
		return father;
	}
	
	public ArrayList<Node> getSons(){
		return sons;
	}
	
	public String toString()
	{
		String father_key;
		if( key == father.getKey() )
		{
			father_key = "Root node";
		} else 
		{
			father_key = father.getKey().toString();
		}
		return "Key : " + key.toString() 
			 + "\nValue : " + value
			 + "\nFather : " + father_key;
	}
	
}