import java.util.Scanner;

public class SARB{
	
	public Hole repotHole(){

		int id, size;
		String address, district;

		Scanner read = new Scanner(System.in);

		System.out.println("ID:");
		id = read.nextInt();
		System.out.println("Address:");
		address = read.next();
		System.out.println("Size:");
		size = read.nextInt();
		System.out.println("District:");
		district = read.next();

		Hole hole = new Hole(id, size, address, district);

		return hole;

	}

	public void damageReport(Hole hole, Citzen citzen){

		System.out.println(">>> Name: " + citzen.getName());
		System.out.println(">>> Address: " + citzen.getAddress());
		System.out.println(">>> Phone: " + citzen.getPhone());
		System.out.println(">>> Size (Hole): " + hole.getSize());
		System.out.println(">>> Custo: R$" + 1000.00);


	}

	public static void main(String [] args){

		Scanner read = new Scanner(System.in);
		SARB sarb = new SARB();
		
		Hole hole;

		System.out.println(">>>>> SARB <<<<");
		System.out.println("First, tell us who you are?");
		System.out.println(">>> Your name:");
		String name = read.next();
		System.out.println(">>> Your address:");
		String address = read.next();
		System.out.println(">>> Your phone:");
		String phone = read.next();

		Citzen citzen = new Citzen(name, address, phone);

		System.out.println("Now tell us about the hole");
		hole = sarb.repotHole();

		sarb.damageReport(hole, citzen);

	}

}