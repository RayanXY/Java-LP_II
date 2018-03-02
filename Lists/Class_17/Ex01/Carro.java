/**
 * This class represents a simple car. It is an extension
 * of the ProdutoDuravel class, inheriting its attributes and adding
 * mileage and color.
 *
 * @author Rayan Avelino
 * @version 23.08.2017
 */
public class Carro extends ProdutoDuravel{

	private double kilometragem;
	private String cor;
	
	/**
	 * Creates a car.
	 * @param id - The car's id.
	 * @param nome - The car's name.
	 * @param preco - The car's price.
	 * @param marca - The car's brand.
	 * @param descricao - The car's description.
	 * @param data_fabricacao - The car's date of manufacture.
	 * @param material_pred - The car's predominant material.
	 * @param durabilidade - The car's durability.
	 * @param kilometragem - The car's mileage.
	 * @param color - The car's color.
	 */
	public Carro(int id, String nome, double preco, String marca, String descricao, String data_fabricacao, String material_pred, String durabilidade, double kilometragem, String cor){
		
		super(id, nome, preco, marca, descricao, data_fabricacao, material_pred, durabilidade);
		this.kilometragem = kilometragem;
		this.cor = cor;
		
	}
	
	/**
	 * Sets the car's mileage.
	 * @param kilometragem - The car's mileage.
	 */
	public void setKilometragem(double kilometragem){
		this.kilometragem = kilometragem;
	}

	/**
	 * Sets the car's color.
	 * @param cor - The car's color.
	 */
	public void setCor(String cor){
		this.cor = cor;
	}

	/**
	 * @return The car's mileage.
	 */
	public double getKilometragem(){
		return kilometragem;
	}

	/**
	 * @return The car's color.
	 */
	public String getCor(){
		return cor;
	}
	
	/**
	 * Adds the distance travled to the mileage.
	 * @param km_percorridos - The distance travled.
	 */
	public void rodar(double km_percorridos){
		kilometragem = kilometragem + km_percorridos;
	}

	public void isEletronic(){
		super.setEletronic(false);
	}

	public void sold(){
		super.setSold(true);
	}

}
