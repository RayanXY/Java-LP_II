public class Appointment{

	private StatusAppointment status;
	private int schedule;
	private Animal animal;
	
	public Appointment(Animal animal, int schedule){
	
		this.animal = animal;
		this.schedule = schedule;
		status = StatusAppointment.BOOKED;
	
	}
	
	public void unmarkAppointment(){
		status = StatusAppointment.UNMARKED;
	}
	
	public void rebookAppointment(int hour){
		status = StatusAppointment.REBOOKED;
		schedule = hour;
	}
	
	public void doneAppointment(){
		status = StatusAppointment.DONE;
	}
	
	public String toString(){
		return "> STATUS: " + status + "\n" + animal.toString();
	}

}
