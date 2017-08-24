import java.util.Calendar;

public class Moto extends Veiculos{

	private String partida;
	private int cilindradas;
	
	public Moto(String marca, String modelo, String placa, String partida, int cilindradas){
	
		super(marca, modelo, placa);
		this.partida = partida;
		this.cilindradas = cilindradas;
	
	}
	
	public void setPartida(String partida){
		this.partida = partida;
	}
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
	}
	
	public String getPartida(){
		return partida;
	}
	
	public int getCilindradas(){
		return cilindradas;
	}
	
	public Calendar vencimento(Calendar c){
		c.add(Calendar.DATE, 3);
		return c;
	}
	
	public double custo(){
		return 2.00 * cilindradas;
	}

}
