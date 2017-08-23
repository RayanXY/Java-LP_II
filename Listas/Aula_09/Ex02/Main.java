public class Main{

	public static void main(String [] args){
	
		Deposito armazem = new Deposito();
		
		Carro carro = new Carro("M3 GTR", 219900.0, "BMW", "4.0 Coupé V8 32V Automático", "2011/2012", "Metal", "20 anos", 19.935, "Prata/Azul");
		
		Celular celular = new Celular("Xperia Play", 549.90, "Sony Ericsson", "Jogue em todo lugar", "2010", "Plástico/Metal", "5 anos", 15.00, "Android 2.3 Gingerbread");
		
		Livro livro = new Livro("O Nome do Vento", 39.90, "Arqueiro", "Fantasia","2009", "Papel", "Depende do usuário", 656, "Patrick Rothfuss");
		
		Chocolate chocolate = new Chocolate("Chocolate Laka", 5.99, "Lacta", "Chocolate branco", "2017", "2018", "Alimento", 24, "Chocolate branco");
		
		Pizza pizza = new Pizza("Pizza Meia Frango/Calabresa", 45.00, "Pizza Hut", "Pizza com borda recheada", "23/08/2017", "10 dias", "Alimento", "1/2 Frango c/ Catupiry 1/2 Calabresa", 8);
		
		Refrigerante refrigerante = new Refrigerante("Fanta", 7.99, "Coca-Cola", "Bebisa gaseficada", "2017", "2018", "Bebida", 2.0, "Laranja");
		
		System.out.println(">>> Verificando se o depósito está vazio.");
		armazem.deposito_vazio();
		
		System.out.println();
		
		System.out.println(">>> Adicionando produtos...");
		armazem.adiciona_prod(carro);
		armazem.adiciona_prod(celular);
		armazem.adiciona_prod(livro);
		armazem.adiciona_prod(chocolate);
		armazem.adiciona_prod(pizza);
		armazem.adiciona_prod(refrigerante);
		System.out.println(">>> O depósito contem: " + armazem.quantidade_produtos() + " produto(s).");
		
		System.out.println();
		
		System.out.println(">>> Verificando produto mais caro...");
		armazem.mais_caro();
		
		System.out.println();
		
		System.out.println(">>> Removendo o livro...");
		armazem.remove_prod(livro);
		System.out.println(">>> O depósito contem: " + armazem.quantidade_produtos() + " produto(s).");
		
	}

}
