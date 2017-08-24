import java.util.Calendar;
/**
 * This class represents simple motocycle model. It is an extension
 * of the Veiculo class, inheriting its attributes and adding the 
 * type of start and the cylinder capacity.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */

public class Moto extends Veiculos{

	private String partida; 	/// Type of start.
	private int cilindradas;	/// Cylinder capacity.
	
	/**
	 * Creates a motocycle.
	 * @param marca - The maker of the car.
	 * @param modelo - The model of the car.
	 * @param placa - The plate of the car.
	 * @param partida - The type of start.
	 * @param cilindradas - The cylinder capacity.
	 */	
	public Moto(String marca, String modelo, String placa, String partida, int cilindradas){
	
		super(marca, modelo, placa);
		this.partida = partida;
		this.cilindradas = cilindradas;
	
	}
	
	/**
	 * Sets the type of start.
	 * @param partida = Type of start.
	 */
	public void setPartida(String partida){
		this.partida = partida;
	}
	
	/**
	 * Sets the cylinder capacity.
	 * @param cilindradas - Cylinder capacity.
	 */
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
	}
	
	/**
	 * @return The type of start.
	 */
	public String getPartida(){
		return partida;
	}
	
	/**
	 * @return The cylinder capaity.
	 */
	public int getCilindradas(){
		return cilindradas;
	}
	
	/**
	 * @Override
	 * Sets the motocycle's return date.
	 * @param data - The date of the rental.
	 */
	public Calendar vencimento(Calendar data){
		data.add(Calendar.DATE, 3);
		return data;
	}
	
	/**
	 * @Override
	 * @return The cost of the rent.
	 */
	public double custo(){
		return 2.00 * cilindradas;
	}

}
