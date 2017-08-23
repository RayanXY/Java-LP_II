import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Locadora{

	private ArrayList<Veiculos> veiculos;
	
	public Locadora(){
		
		veiculos = new ArrayList<Veiculos>();
		
	}
	
	public void cadastra_veiculo(Veiculos v){
		veiculos.add(v);
	}
	
	public void todos_veiculos(){
		int sz = veiculos.size();
		Veiculos v;
		System.out.println("Marca | Modelo | Placa | Disponibilidade");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			System.out.println(v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca() + " | " + v.esta_alugado());
		}
	}
	
	public void disponiveis(){
		int sz = veiculos.size();
		Veiculos v;
		System.out.println("Marca | Modelo | Placa");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			if(v.getAlugado() == false){
				System.out.println(v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca());
			}
		}	
	}

	public void alugar_veiculo(Veiculos v, Cliente c){
		if(v.getAlugado()){
			System.out.println("Veículo indisponível!");
		}else{
			Calendar data = Calendar.getInstance();
			v.setData(data);
			v.setAlugador(c);
			v.setAlugado(true);
		}
	}
	
	public void recibo(Veiculos v, Cliente c){
		if(v.getAlugador() == c){
			Calendar data = Calendar.getInstance();
			System.out.println("Nome: " + c.getNome());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Custo: R$ " + v.custo());
			// Data de vencimento
			Calendar vencimento = v.vencimento();
			SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
			String data = dF.format(vencimento.getTime());
			//
			System.out.println("Data de Vencimeno: " + data);
			
		}else{
			System.out.println("Esse veículo não foi alugado por esse cliente");
		}
	}
	
	public void devolucao(Veiculos v, Cliente c, Calendar data){
		if(v.getAlugador() == c){
			
		}else{
			System.out.println("Esse veículo não foi alugado por esse cliente");
		}
	}

}
