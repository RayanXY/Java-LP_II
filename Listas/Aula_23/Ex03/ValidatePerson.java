public class ValidatePerson{

	public boolean isStatus(String status){

		if(status.equals("S")){
			return true;
		}else if(status.equals("C")){
			return true;
		}else if(status.equals("V")){
			return true;
		}else if(status.equals("D")){
			return true;
		}else{
			return false;
		}

	}
	
	public Person validate(String line) throws ParameterException{

		int i = 0;
		int size = line.length();

		String name = "";
		while(i < size){

			if(Character.toString(line.charAt(i)).equals("-")){
				i++;
				break;
			}else if(Character.isLetter(line.charAt(i)) || Character.toString(line.charAt(i)).equals(" ")){
				name += Character.toString(line.charAt(i));
				i++;
			}else{
				throw new ParameterException("The name cannot contain numbers");
			}

		}

		String ageS = "";
		while(i < size){

			if(Character.toString(line.charAt(i)).equals("-")){
				i++;
				break;
			}else if(Character.toString(line.charAt(i)).equals(" ")){
				i++;
			}else if(Character.isDigit(line.charAt(i))){
				ageS += Character.toString(line.charAt(i));
				i++;
			}else{
				throw new ParameterException("The age can only contain numbers");
			}

		}

		String status = "";
		while(i < size){

			if(Character.toString(line.charAt(i)).equals("-")){
				i++;
				break;
			}else if(Character.toString(line.charAt(i)).equals(" ")){
				i++;
			}else if(isStatus(Character.toString(line.charAt(i)))){
				status += Character.toString(line.charAt(i));
				i++;
			}else{
				throw new ParameterException("Invalid civil status");
			}

		}

		String acceptanceS = "";
		while(i < size){

			if(Character.toString(line.charAt(i)).equals("-")){
				i++;
				break;
			}else if(Character.toString(line.charAt(i)).equals(" ")){
				i++;
			}else if(Character.isDigit(line.charAt(i))){
				acceptanceS += Character.toString(line.charAt(i));
				i++;
			}else{
				throw new ParameterException("The acceptance can only contain numbers");
			}

		}

		/// Creating the Person
		if(name.length() < 5 || name.length() > 50){
			throw new ParameterException("The name must contain 5 to 50 characters");
		}		

		int age = Integer.parseInt(ageS);
		if(age < 0 || age > 127){
			throw new ParameterException("The age must be a integer between 0 to 127");
		}

		if(status.length() < 1 || status.length() > 1){
			throw new ParameterException("The civil status must have only one character");	
		}

		int acceptance = Integer.parseInt(acceptanceS);
		if(acceptance < 0 || acceptance > 10){
			throw new ParameterException("The acceptance must be between 0 to 10");
		}

		/// Everything is right
		Person person = new Person(name, age, status, acceptance);

		return person;

	}

}