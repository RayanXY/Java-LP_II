import java.util.Calendar;

/**
 * This class represents simple vehicle model. With the maker,
 * model and license plate. To help the rent company, I added 
 * the client who is renting the car and the date of the rental 
 * and an attribute to check if the vehilce is rented.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Veiculos{

	private String marca, modelo, placa; 	/// Brand/Maker, model and license plate.
	private boolean alugado; 				/// Rented
	private Cliente alugador;				/// Cliente who's renting
	private Calendar data;					/// Date of the rental.
	
	/**
	 * Creates a vehicle.
	 * @param marca - The maker of the vehicle.
	 * @param modelo - The model of the vehicle.
	 * @param placa - The plate of the vehicle.
	 */
	public Veiculos(String marca, String modelo, String placa){

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		alugado = false;
		alugador = new Cliente(null, 0);
		data = null;
	
	}
	
	/**
	 * Sets the maker of the vehicle.
	 * @param marca - The maker of the car.
	 */
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	/**
	 * Sets the model of the vehicle.
	 * @param modelo - The model of the vehicle.
	 */
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	/**
	 * Sets the plate of the vehicle.
	 * @param placa - The plate of the vehicle.
	 */
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	/**
	 * Sets vehicle's availability.
	 * @param alugado - The availability of the vehicle.
	 */
	public void setAlugado(boolean alugado){
		this.alugado = alugado;
	}
	
	/**
	 * Sets the renter the vehicle.
	 * @param marca - The renter of the vehicle.
	 */
	public void setAlugador(Cliente alugador){
		this.alugador = alugador;
	}
	
	/**
	 * Sets the date of the rental.
	 * @param marca - The date of the rental.
	 */
	public void setData(Calendar data){
		this.data = data;
	}
	
	/**
	 * @return The maker of the vehicle.
	 */
	public String getMarca(){
		return marca;
	}
	
	/**
	 * @return The model of the vehicle.
	 */
	public String getModelo(){
		return modelo;
	}
	
	/**
	 * @return The plate of the vehicle.
	 */
	public String getPlaca(){
		return placa;
	}
	
	/**
	 * @return The availability of the vehicle.
	 */
	public boolean getAlugado(){
		return alugado;
	}
	
	/**
	 * @return The renter of the vehicle.
	 */
	public Cliente getAlugador(){
		return alugador;
	}
	
	/**
	 * @return The date of the rental.
	 */
	public Calendar getData(){
		return data;
	}
	
	/**
	 * @return A String with the availability of the vehicle.
	 */
	public String esta_alugado(){
		if(alugado){
			return "Alugado";
		}else{
			return "Disponível";
		}
	}
	
	/**
	 * Abstract method
	 * @return an abstract date.
	 */
	public Calendar vencimento(Calendar c){
		return c;
	}
	
	/**
	 * Abstract method
	 * @retunr an abstract cost.
	 */
	public double custo(){
		return 0.0;
	}

}
