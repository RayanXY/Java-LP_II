public class Main{

	public static void main(String [] args){
	
		Locadora locavel = new Locadora();
		
		Cliente cliente1 = new Cliente("Rayan", 1265498); 
		Cliente cliente2 = new Cliente("Avelino", 1658996); 
		Carro carro1 = new Carro("Fiat", "Uno", "ASP-190", 1.6, 4);
		Moto moto1 = new Moto("Honda", "Pop", "NSF-W69", "Elétrica", 100);
		
		locavel.cadastra_veiculo(carro1);
		locavel.cadastra_veiculo(moto1);
		locavel.alugar_veiculo(carro1, cliente1);
		
		System.out.println();
		
		locavel.disponiveis();
		
		System.out.println();
		
		locavel.recibo(carro1, cliente1);
	
	}

}
