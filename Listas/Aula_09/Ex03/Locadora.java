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
		System.out.println("> Marca | Modelo | Placa | Disponibilidade");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			System.out.println("> " + v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca() + " | " + v.esta_alugado());
		}
	}
	
	public void disponiveis(){
		int sz = veiculos.size();
		Veiculos v;
		System.out.println("> Marca | Modelo | Placa");
		for(int i = 0; i < sz; i++){
			v = veiculos.get(i);
			if(v.getAlugado() == false){
				System.out.println("> " + v.getMarca() + " | " + v.getModelo() + " | " + v.getPlaca());
			}
		}	
	}

	public void alugar_veiculo(Veiculos v, Cliente c){
		if(v.getAlugado()){
			System.out.println("> Veículo indisponível!");
		}else{
			Calendar data = Calendar.getInstance();
			v.setData(data);
			v.setAlugador(c);
			v.setAlugado(true);
		}
	}
	
	public void recibo(Veiculos v, Cliente c){
		if(v.getAlugador() == c){
			/// Data de vencimento
			Calendar vencimento = v.vencimento(v.getData());
			SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
			String n_data = dF.format(vencimento.getTime());
			/// Recibo
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
	
	public void devolucao(Veiculos v, Cliente c){
		if(v.getAlugador() == c){
			Calendar pagamento = Calendar.getInstance();
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
	
	/// Metodo especial para testar o atraso
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
