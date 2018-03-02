public class Hole{
	
	private int id, size;
	private String address, district, priority;

	public Hole(int id, int size, String address, String district){

		this.id = id;
		this.size = size;
		this.address = address;
		this.district = district;
		if(size >= 1 && size <= 4){
			priority = "Low";
		}else if(size >= 5 && size <= 7){
			priority = "Medium";
		}else if(size >= 8 && size <= 10){
			priority = "High";
		}

	}

	public int getId(){
		return id;
	}

	public int getSize(){
		return size;
	}

	public String getAddress(){
		return address;
	}

	public String getDistrict(){
		return district;
	}

}