import java.util.Calendar;

public class Veiculos{

	private String marca, modelo, placa;
	private boolean alugado;
	private Cliente alugador;
	private Calendar data;
	
	public Veiculos(String marca, String modelo, String placa){

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		alugado = false;
		alugador = new Cliente(null, 0);
		data = null;
	
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
	public void setAlugado(boolean alugado){
		this.alugado = alugado;
	}
	public void setAlugador(Cliente alugador){
		this.alugador = alugador;
	}
	public void setData(Calendar data){
		this.data = data;
	}
	
	public String getMarca(){
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
	public String getPlaca(){
		return placa;
	}
	public boolean getAlugado(){
		return alugado;
	}
	public Cliente getAlugador(){
		return alugador;
	}
	public Calendar getData(){
		return data;
	}
	
	public String esta_alugado(){
		if(alugado){
			return "Alugado";
		}else{
			return "Disponível";
		}
	}
	public String vencimento(Calendar c){
		return null;
	}
	public double devolucao(Calendar c){
		return null;
	}
	public double custo(){
		return 0.0;
	}

}
