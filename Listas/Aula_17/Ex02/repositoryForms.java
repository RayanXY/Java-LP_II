import java.util.*;

public class repositoryForms{
	
	public static void main(String [] args){

		/// Where the forms will be stored.
		ArrayList<Forms> repository = new ArrayList<Forms>();
		/// The random generator
		Random rand = new Random();
		/// Variable to determinate which form will be generated. 
		int objectCont;

		/// 10 random forms with random attributes will be generated.
		for(int i = 0; i < 10; i++){
			objectCont = rand.nextInt(3);
			/// Creates a rectangle.
			if(objectCont == 0){
				float height = rand.nextInt(1000);
				float width = rand.nextInt(1000);
				Rectangle rect = new Rectangle(height, width);
				repository.add(rect);
			/// Creates a circle.
			}else if(objectCont == 1){
				float radius = rand.nextInt(1000);
				Circle circ = new Circle(radius);
				repository.add(circ);
			/// Creates a square.
			}else{
				float side = rand.nextInt(1000);
				Square squr = new Square(side);
				repository.add(squr);
			}

		}

		/// Print all the forms stored.
		for(Forms forms : repository){
			System.out.println(forms);
		}

	}

}