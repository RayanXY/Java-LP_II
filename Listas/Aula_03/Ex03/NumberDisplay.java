
/**
 * Escreva a descrição da classe NumberDisplay aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class NumberDisplay{
    
    // Variables
    private int limit;
    private int value;
    
    // Contructors
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }
    
    // Gets and Sets
    public int getValue(){
        return value;
    }
    public void setValue(int replacementValue){
        if((replacementValue >= 0)&&(replacementValue < limit)){
            value = replacementValue;
        }
    }
    
    // Methods
    public String getDisplayValue(){
        if(value < 10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }
    public void increment(){
        value = (value+1) % limit;
    }
    
}
