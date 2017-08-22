public class Professor{

	private String nome; 
	private String matricula;
	private int idade;
	
	public Professor(String nome, String matricula, int idade){
	
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return idade;
	}

}
