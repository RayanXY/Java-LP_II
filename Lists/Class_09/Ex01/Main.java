public class Main{

	public static void main(String [] args){
	
		/// Testando o ProfessorRegime
		ProfessorRegime prof_R = new ProfessorRegime("Luigi", "Vasco06", 20, 400.0);
		
		System.out.println(">>> Professor Integral");
		System.out.println("Nome: " + prof_R.getNome() );
		System.out.println("Matrícula: " + prof_R.getMatricula() );
		System.out.println("Idade: " + prof_R.getIdade() );
		System.out.println("Salário: " + prof_R.getSalario() );
		
		System.out.println();
		
		/// Mudando os dados
		prof_R.setNome("Mario");
		prof_R.setMatricula("2015698S");
		prof_R.setIdade(39);
		prof_R.setSalario(1200.0);
		
		System.out.println(">>> Novo Professor Integral");
		System.out.println("Nome: " + prof_R.getNome() );
		System.out.println("Matrícula: " + prof_R.getMatricula() );
		System.out.println("Idade: " + prof_R.getIdade() );
		System.out.println("Salário: " + prof_R.getSalario() );
		
		System.out.println();
		
		/// Testando ProfessorHorista
		ProfessorHorista prof_H = new ProfessorHorista("Snake", "0846219", 39, 4, "12.0");
		
		System.out.println(">>> Professor Horista");
		System.out.println("Nome: " + prof_H.getNome() );
		System.out.println("Matrícula: " + prof_H.getMatricula() );
		System.out.println("Idade: " + prof_H.getIdade() );
		System.out.println("Horas: " + prof_H.getTotal_horas() );
		System.out.println("Salário p/ hora: " + prof_H.getSalario_hora() );
		System.out.println("Salario: " + prof_H.salario() );
		
		System.out.println();
		
		/// Mudando os dados
		prof_H.setNome("Kratos");
		prof_H.setMatricula("2015698S");
		prof_H.setIdade(39);
		prof_H.setTotal_horas(6);
		prof_H.setSalario_hora("20.0");
		
		System.out.println(">>> Novo Professor Horista");
		System.out.println("Nome: " + prof_H.getNome() );
		System.out.println("Matrícula: " + prof_H.getMatricula() );
		System.out.println("Idade: " + prof_H.getIdade() );
		System.out.println("Horas: " + prof_H.getTotal_horas() );
		System.out.println("Salário p/ hora: " + prof_H.getSalario_hora() );
		System.out.println("Salario: " + prof_H.salario() );
		
	
	}

}
