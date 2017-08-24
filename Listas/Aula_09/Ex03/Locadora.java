import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * This class represents simple rent company. It creates a list
 * of the vehicles, rents them, prints receipt and receve the vehicle back.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Locadora{

	private ArrayList<Veiculos> veiculos;	/// List to store the vehicles.
	
	/**
	 * Creates a list to store the vehicles.
	 */
	public Locadora(){
		
		veiculos = new ArrayList<Veiculos>();
		
	}
	
	/**
	 * Stores a vehicle in the list.
	 * @param v - The vehicle to be stored.
	 */
	public void cadastra_veiculo(Veiculos v){
		veiculos.add(v);
	}
	
	/**
	 * Prints all the vehicles stored in the list.
	 */
	public void todos_veiculos(){
		int sz = veiculos.size();
		Veiculos v;
		System.out.println("> Marca | Modelo | Placa | Disponibilidade");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			System.out.println("> " + v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca() + " | " + v.esta_alugado());
		}
	}
	
	/**
	 * Prints only the available vehicles.
	 */
	public void disponiveis(){
		int sz = veiculos.size();
		Veiculos v;
		System.out.println("> Marca | Modelo | Placa");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			/// Checks if the vehicle is available.
			if(v.getAlugado() == false){
				System.out.println("> " + v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca());
			}
		}	
	}

	/**
	 * Rents the vehicle that are available.
	 * @param v - The vehicle to be rented.
	 * @param c = The renter.
	 */
	public void alugar_veiculo(Veiculos v, Cliente c){
		if(v.getAlugado()){			//<! Checks if the vehicle is available.
			System.out.println("> Veículo indisponível!");
		}else{
			Calendar data = Calendar.getInstance();
			v.setData(data);		//!< Sets the date of the rent.
			v.setAlugador(c);		//!< Sets the renter.
			v.setAlugado(true);		//!< Turns the vehicle to unavailable.
		}
	}
	
	/**
	 * Prints the rent's receipt.
	 * @param v - The rented vehicle.
	 * @param c = The renter.
	 */
	public void recibo(Veiculos v, Cliente c){
		if(v.getAlugador() == c){
			/// Setting up the date for printing.
			Calendar vencimento = v.vencimento(v.getData());
			SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
			String n_data = dF.format(vencimento.getTime());
			/// Receipt.
			System.out.println(">>> RECIBO <<<");
			System.out.println("> Nome: " + c.getNome());
			System.out.println("> Modelo: " + v.getModelo());
			System.out.println("> Custo: R$ " + v.custo());
			System.out.println("> Data de Vencimeno: " + n_data);
			System.out.println(">>> FIM <<<");
		}else{
			System.out.println(">>> Esse veículo não foi alugado por esse cliente");
		}
	}
	
	/**
	 * Makes the return of vehicle, applying a fine in case of delay.
	 * @param v - The rented vehicle.
	 * @param c = The renter.
	 */
	public void devolucao(Veiculos v, Cliente c){
		if(v.getAlugador() == c){
			Calendar pagamento = Calendar.getInstance();		//<! Payment day.
			Calendar vencimento = v.vencimento(v.getData());	//<! Return day.
			/// Check if the payment was made in before the return day.
			if(pagamento.before(vencimento)){					
				v.setAlugado(false);							//<! Set vehicle available.
				v.setAlugador(null);
				System.out.println(">>> Obrigado por escolher o Locavel!");
			}else{
				/// Check day number of days in delay.
				int dias_atrasado = pagamento.get(Calendar.DAY_OF_YEAR) - vencimento.get(Calendar.DAY_OF_YEAR);
				/// Calculates the fine.
				double novo_custo = (v.custo() * 0.20) * dias_atrasado;		
				System.out.println(">>> Multa: R$"  + novo_custo);
				System.out.println("** " + dias_atrasado + " dias de atraso **");
				v.setAlugado(false);							//<! Set vehicle available.
				v.setAlugador(null);
			}
		}else{
			System.out.println(">>> Esse veículo não foi alugado por esse cliente");
		}
	}
	
	/**
	 * Special methodo to demonstrate a case of delay.
	 */
	public void devolucao(Veiculos v, Cliente c, int d){
		if(v.getAlugador() == c){
			Calendar pagamento = Calendar.getInstance();
			pagamento.add(Calendar.DATE, 8);
			Calendar vencimento = v.vencimento(v.getData());
			if(pagamento.before(vencimento)){
				v.setAlugado(false);
				v.setAlugador(null);
				System.out.println(">>> Obrigado por escolher o Locavel!");
			}else{
				int dias_atrasado = pagamento.get(Calendar.DAY_OF_YEAR) - vencimento.get(Calendar.DAY_OF_YEAR);
				double novo_custo = (v.custo() * 0.20) * dias_atrasado;
				System.out.println(">>> Multa: R$"  + novo_custo);
				System.out.println("** " + dias_atrasado + " dias de atraso **");
				v.setAlugado(false);
				v.setAlugador(null);
			}
		}else{
			System.out.println(">>> Esse veículo não foi alugado por esse cliente");
		}
	}

}
