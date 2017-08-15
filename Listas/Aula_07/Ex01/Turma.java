public class Turma{

	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	
	public Turma(Aluno a1, Aluno a2, Aluno a3){
		
		aluno1 = a1;
		aluno2 = a2;
		aluno3 = a3;
	
	}
	
	public double calcularMedia(){
	
		return (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia())/3;
	
	}

}
