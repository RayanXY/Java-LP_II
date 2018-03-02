/**
 * Escreva a descrição da classe ClockDisplay aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ClockDisplay{
    
    // Variables
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
  
    // Constructors
    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    public ClockDisplay(int hour, int minute){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
    
    // Methods
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay();
    }
    public void setTime(int hour, int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    public String getTime(){
        return displayString;
    }
    private void updateDisplay(){
        int auxHour = hours.getValue();
        if(auxHour <= 12){
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "AM";
        }else{
            displayString = auxHour%12 + ":" + minutes.getDisplayValue() + "PM";
        }
    }
}
