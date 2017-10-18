public class ValidatePerson{

	/// S C V D
	public boolean isStatus(String status){

		if(trace.equals("S")){
			return true;
		}else if(trace.equals("C")){
			return true;
		}else if(trace.equals("V")){
			return true;
		}else if(trace.equals("D")){
			return true;
		}else{
			return false;
		}

	}
	
	public Person validate(String line){

		int i = 0;
		int size = line.length();

		if(line.isEmpty()){
			return;
		}

		line = line.replace(" ", "");

		String name = "";
		while(i < size){
			String currentChar = Character.toString(line.charAt(i));
			if(!Character.isDigit(line.charAt(i))){
				name += currentChar;
				i++;
			}

			if(Character.toString(line.charAt(i+1)).equals("-")){
				break;
			}
		}

		String ageS = "";
		while(i < size){
			String currentChar = Character.toString(line.charAt(i));
			if(Character.isDigit(line.charAt(i))){
				ageS += currentChar;
				i++;
			}

			if(Character.toString(line.charAt(i+1)).equals("-")){
				break;
			}
		}

		String statusS = "";
		while(i < size){
			String currentChar = Character.toString(line.charAt(i));
			if(isOperator(currentChar)){
				statusS += currentChar;
				i++;
			}

			if(Character.toString(line.charAt(i+1)).equals("-")){
				break;
			}
		}

		String acceptanceS = "";
		while(i < size){
			String currentChar = Character.toString(line.charAt(i));
			if(Character.isDigit(line.charAt(i))){
				acceptanceS += currentChar;
				i++;
			}

			if(Character.toString(line.charAt(i+1)).equals("-")){
				break;
			}
		}

	}

}