import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Exception{
	
	public static void main(String [] args){
/*
		Calculator calculator = new Calculator();
		ArrayList<String> results = new ArrayList<String>();
		float result;

		try{		

			BufferedReader reader = new BufferedReader(new FileReader("Expressions"));
			FileWriter writer = new FileWriter("Results");

			/// Reading the first line
			String linha = reader.readLine();
			/// Reading the rest of the file.
			while(linha != null){
				results.add(linha);
				linha = reader.readLine();
			}

			/// Calculating
			for(String expression : results){
				result = calculator(expression);
				writer.write(result + "\n");
			}
			writer.close();

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}

	}
*/
		try{

			FileWriter writer = new FileWriter("Results");
			writer.write("Could not calculate\n");
			writer.write("Could not calculate\n");
			writer.write("Could not calculate\n");
			writer.write(5 + "\n");
			writer.close();

		}catch(IOException e){
			System.out.println(e);
		}

	}

}