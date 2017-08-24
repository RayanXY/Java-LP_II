public class Main{

	public static void main(String [] args){
	
		/// Creating a rent company.
		Locadora locavel = new Locadora();
		
		/// Creating some clients.
		Cliente cliente1 = new Cliente("Rayan", 1265498); 
		Cliente cliente2 = new Cliente("Lucas", 7658996); 
		Cliente cliente3 = new Cliente("Gabi", 6184849);
		Cliente cliente4 = new Cliente("Anderson", 2457844);
		
		/// Creating some vehicles.
		Carro carro1 = new Carro("Fiat", "Uno", "ASP-190", 1.6, 4);
		Carro carro2 = new Carro("Ford", "New Fiesta", "APS-878", 1.8, 4);
		Carro carro3 = new Carro("Fiat", "Punto", "BSH-751", 1.0, 2);		
		Moto moto1 = new Moto("Honda", "Pop", "EWN-862", "Manual", 100);
		Moto moto2 = new Moto("Honda", "Bros", "CVI-154", "Elétrica", 160);
		Moto moto3 = new Moto("Yamaha", "XTZ Crosser", "QTI-453", "Elétrica", 150);		
		
		/// Stoting the vehicles.
		locavel.cadastra_veiculo(carro1);
		locavel.cadastra_veiculo(carro2);
		locavel.cadastra_veiculo(carro3);
		locavel.cadastra_veiculo(moto1);
		locavel.cadastra_veiculo(moto2);
		locavel.cadastra_veiculo(moto3);
		
		System.out.println(">>> Bem vindo à Locavel!");
		System.out.println("Esses são os veículos que trabalhamos:");
		locavel.todos_veiculos();				//!< Printing all the vehicles.
		
		System.out.println();
		
		/// Making rents.
		System.out.println(">>> Registrando alugueis...");
		locavel.alugar_veiculo(carro1, cliente2);
		locavel.alugar_veiculo(moto3, cliente1);
		locavel.alugar_veiculo(moto2, cliente4);
		locavel.alugar_veiculo(carro2, cliente3);
		
		System.out.println();
		
		/// Printing receipts.
		locavel.recibo(carro1, cliente2);		//!< Right.
		System.out.println();
		locavel.recibo(moto3, cliente1);		//!< Right.
		System.out.println();
		locavel.recibo(carro3, cliente4);		//!< Wrong.
		locavel.recibo(moto1, cliente3);		//!< Wrong.
		
		System.out.println();
		
		System.out.println("Esses são os veículos que trabalhamos:");
		locavel.todos_veiculos();				//!< Printing all the vehicles.	
		
		System.out.println();
		
		System.out.println("Esses são os veículos disponíveis:");
		locavel.disponiveis();					//!< Printing only the vehicles available.
		
		System.out.println();
		
		/// Making impossibles rents.
		System.out.println(">>> Registrando os alugueis...");
		locavel.alugar_veiculo(carro1, cliente3);
		locavel.alugar_veiculo(moto3, cliente2);
		
		System.out.println();
		
		/// Returning some vehicles.
		System.out.println(">>> Efetuando os pagamentos...");
		locavel.devolucao(carro1, cliente2);	//!< On time.
		locavel.devolucao(moto3, cliente1);		//!< On time.
		locavel.devolucao(moto2, cliente2);		//!< Wrong.
		locavel.devolucao(carro2, cliente3, 1);	//!< Delayed.
		
		System.out.println();
		
		System.out.println("Esses são os veículos que trabalhamos:");
		locavel.todos_veiculos();				//!< Printing all the vehicles.
		
		System.out.println();
		
		System.out.println("Esses são os veículos disponíveis:");
		locavel.disponiveis();					//!< Printing only the vehicles available.
	
	}

}
