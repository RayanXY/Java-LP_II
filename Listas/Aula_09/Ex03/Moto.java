import java.util.Calendar;
import java.text.SimpleDateFormat;

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
	
	public String vencimento(Calendar atual){
		SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
		Calendar vencimento = atual;
		vencimento.add(Calendar.DATE, 3);
		String data = dF.format(vencimento.getTime());
		
		return data;
	}
	
	public double custo(){
		return 2.00 * cilindradas;
	}

}
