import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Carro extends Veiculos{

	private double potencia;
	private int quant_portas;
	
	public Carro(String marca, String modelo, String placa, double potencia, int quant_portas){
	
		super(marca, modelo, placa);
		this.potencia = potencia;
		this.quant_portas = quant_portas;
	
	}
	
	public void setPotencia(double potencia){
		if(potencia < 1.0 || potencia > 3.0){
			System.out.println("Potência fora dos limites!");
		}else{
			this.potencia = potencia;
		}
	}
	public void setQuant_portas(int quant_portas){
		this.quant_portas = quant_portas;
	}
	
	public double getPotencia(){
		return potencia;
	}
	public int getQuant_portas(){
		return quant_portas;
	}
	
	public Calendar vencimento(Calendar c){
		c.add(Calendar.DATE, 2);
		return c;
	}
	public double devolucao(Calendar data_pagamento){
		
	}
	
	public double custo(){
		return 100.00 * potencia;
	}

}
