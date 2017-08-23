import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main{

	public static void main(String [] args){
	
		SimpleDateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
	
		Calendar venc = Calendar.getInstance();
		venc.add(Calendar.DATE, 5);
		
		String venci = dF.format(venc.getTime());
		
		System.out.println("Devolução: " + venci);
		
		Calendar paga_certo = Calendar.getInstance();
		Calendar paga_atras = Calendar.getInstance();
		paga_atras.add(Calendar.DATE, 15);
		
		if(paga_atras.before(venc)){
			System.out.println("Papagamento correto!");
		}else{
			int vencimento = venc.get(Calendar.DAY_OF_YEAR); 
			int pagamento = paga_atras.get(Calendar.DAY_OF_YEAR);
			int dias_atraso = pagamento - vencimento;
			System.out.println("Pagamento atrasado em " + dias_atraso + " dias!");
		}
		
	}

}
