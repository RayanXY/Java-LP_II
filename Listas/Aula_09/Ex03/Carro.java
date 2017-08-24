import java.util.Calendar;

/**
 * This class represents simple car model. It is an extension
 * of the Veiculo class, inheriting its attributes and adding
 * the power and number of doors.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Carro extends Veiculos{

	private double potencia;	/// The power of the car.
	private int quant_portas;	/// The number of doors.
	
	/**
	 * Creates a car.
	 * @param marca - The maker of the car.
	 * @param modelo - The model of the car.
	 * @param placa - The plate of the car.
	 * @param potencia - The power of the car.
	 * @param quant_portas - The number of doors.
	 */
	public Carro(String marca, String modelo, String placa, double potencia, int quant_portas){
	
		super(marca, modelo, placa);
		this.potencia = potencia;
		this.quant_portas = quant_portas;
	
	}
	
	/**
	 * Sets the power within a range.
	 * @param potencia - The power of the car.
	 */
	public void setPotencia(double potencia){
		if(potencia < 1.0 || potencia > 3.0){
			System.out.println("Potência fora dos limites!");
		}else{
			this.potencia = potencia;
		}
	}

	/**
	 * Sets the number of doors.
	 * @param quant_portas - The number of doors.
	 */
	public void setQuant_portas(int quant_portas){
		this.quant_portas = quant_portas;
	}
	
	/**
	 * @return The power of the car.
	 */
	public double getPotencia(){
		return potencia;
	}
	
	/**
	 * @return The number of doors.
	 */
	public int getQuant_portas(){
		return quant_portas;
	}
	
	/**
	 * @Override
	 * Sets the car's return date.
	 * @param data - The date of the rental.
	 */
	public Calendar vencimento(Calendar data){
		data.add(Calendar.DATE, 2);
		return data;
	}
	
	/**
	 * @Override
	 * @return The cost of the rent.
	 */
	public double custo(){
		return 100.00 * potencia;
	}

}
