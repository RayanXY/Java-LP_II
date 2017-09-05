public class Clinic{

	public static void main(String [] args){
	
		Dog dog = new Dog("Luciana", "Mel", "Poodle");
		Cat cat = new Cat("Dercio", "Edmundo", "Persa");
		Bird bird = new Bird("Aylane", "Blu", "Arara-Azul");
		
		Appointment ap1 = new Appointment(dog, 12);
		Appointment ap2 = new Appointment(cat, 10);
		Appointment ap3 = new Appointment(bird, 15);
		
		ap2.unmarkAppointment();
		ap3.rebookAppointment(16);
		
		System.out.println(ap1);
		System.out.println(ap2);
		System.out.println(ap3);
		
		ap1.doneAppointment();
		
		System.out.println(ap1);
	
	}

}
