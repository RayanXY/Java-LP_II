public class Prova{

	private double notaParte1;
	private double notaParte2;
	
	public Prova(double nota1, double nota2){
	
		if(notaParte1 < 0.0 || notaParte2 < 0.0 || notaParte1 > 10.0 || notaParte2 > 10.0){
		
			System.out.println("Insert valids grades!");
			
		}else{
		
			notaParte1 = nota1;
			notaParte2 = nota2;
			
		}
	
	}
	
	public double calcularNotaTotal(){
		
		return notaParte1 + notaParte2;
	
	}

}
