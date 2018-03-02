public class Jogo{

	// Criando a senha
	FornecedorDaSenha password = new FornecedorDaSenha();
	password.criarSenha();

	// Jogador
	Jogador player = new Jogador();

	// Jogada
	Jogada guess = new Jogada();
	
	public boolean verSeAdivinhoGanhouJogo(){

		player.jogar();
		guess.getRetorno();

	}

	public void mostrarPinosTentativaDaJogada(){

	}

	public void mostrarPinosRetornoDaJogada(){

	}

	public void terminarJogo(){

	}

	public void executarJogo(){
		
	}

}
