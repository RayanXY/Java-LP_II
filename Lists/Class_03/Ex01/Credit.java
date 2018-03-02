/**
 * Escreva a descrição da classe Credit aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Credit{
    
    // Variables
    private int credits;

    // Constructors
    public Credit(){
        credits = 1000;
    }
    public Credit(int valor){
        if(valor >= 0){
            credits = valor;
        }else{
            System.out.println("Constructor was called with a negative valor: " + valor);
            credits = 0;
        }
    }
    
    // Get and Set
    public int getCredits(){
        return credits;
    }
    public void setCredits(int valor){
        if(valor >= 0){
            credits = valor;
        }else{
            System.out.println("Invalid credits.");
        }
    }
    
    // Methods
    public void topUp(int valor){
        if(valor > 0){
            credits += valor;
        }else{
            System.out.println("TopUp was called with a negative valor: "+ valor);
        }
    }
    public void consume(int valor){
        if(credits >= valor){
            credits -= valor;
        }else{
            System.out.println("Insufficient credits.");
        }
    }
}
