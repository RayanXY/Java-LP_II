import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Exception{
	
	public static void main(String [] args){

		ArrayList<String> expressions = new ArrayList<String>();
		Calculator calculator = new Calculator();

		/// Reading
		try{		

			BufferedReader reader = new BufferedReader(new FileReader("Expressions"));
			FileWriter writer = new FileWriter("Results");

			/// Reading the first line
			String line = reader.readLine();
			/// Reading the rest of the file.
			while(line != null){
				expressions.add(line);
				line = reader.readLine();
			}

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}

		/// Writing
		try{		

			FileWriter writer = new FileWriter("Results");

			for(String s : expressions){
				if(calculator.validateExpression(s)){
					writer.write(calculator.calculate() + "\n");			
				}else{
					writer.write("Could not calculate\n");
				}
			}
			writer.close();
			
		}catch(IOException e){
			System.out.println(e);
		}

	}

}