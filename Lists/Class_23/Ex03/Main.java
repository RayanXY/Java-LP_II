import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main{
	
	public static void main(String [] args){

		int numberPerson;
		Report report = new Report();
		ValidatePerson person = new ValidatePerson();

		/// Reading
		try{

			BufferedReader reader = new BufferedReader(new FileReader("Input"));
			String line = reader.readLine();
			numberPerson = Integer.parseInt(line);

			if(numberPerson < 0 || numberPerson > 100){
				throw new ParameterException("The number of person must be an integer between 0 to 100");
			}

			line = reader.readLine();
			while(line != null){
				Person per = person.validate(line);
				report.addPerson(per);
				line = reader.readLine();
			}

		}catch(ParameterException ex){
			System.out.println(ex.getMessage());
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		}catch(IOException ex){
			System.out.println(ex);
		}

		/// Writing
		try{

			FileWriter writer = new FileWriter("Output");
			
			report.avarageCivilStatus();

			writer.write("Average age: " + report.averageAge() + "\n");
			writer.write("Percentage of singles: " + report.getSingle() + "%\n");
			writer.write("Percentage of married: " + report.getMarried() + "%\n");
			writer.write("Percentage of widowers: " + report.getWidowed() + "%\n");
			writer.write("Percentage of divorced: " + report.getDivorced() + "%\n");
			writer.write("Average acceptance: " + report.averageAcceptance() + "\n");

			writer.close();

		}catch(IOException ex){
			System.out.println(ex);
		}

	}

}