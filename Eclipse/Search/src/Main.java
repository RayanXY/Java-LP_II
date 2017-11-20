public class Main {

	public static void main(String [] args) {
		
		Node node = new Node( "Olar", 'o');
		node.setFather( node );
		System.out.println(node);
		
	}
	
}
