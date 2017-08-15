
/**
 * Escreva a descrição da classe Heater aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Heater{

    // Variables
    private int temperature, min, max, increment;
    
    // Constructor
    public Heater(int valorMin, int valorMax){
        min = valorMin;
        max = valorMax;
        increment = 5;
        temperature = 15;
    }
    
    // Gets and Sets
    public int getTemperature(){
        return temperature;
    }
    public void setIncrement(int valor){
        if(valor > 0){    
            increment = valor;
        }else{
            System.out.println("Insert a valid increment!");
        }
    }
    
    // Methods
    public void Warmer(){
        int aux = temperature;
        temperature += increment;
        if(temperature > max){
            temperature = aux;
            System.out.println("You can't pass the Max temperature allowed!"); 
        }
    }
    public void Cooler(){
        int aux = temperature;
        temperature -= increment;
        if(temperature < min){
            temperature = aux;
            System.out.println("You can't pass the Min temperature allowed!"); 
        }
    }
    
}
