public class ServiceOrder{
	
	private int teamId, teamSz, sizeHole;
	private String equipment, stateHole, locationHole;
	private float quantMaterial, cost;

	public ServiceOrder(Hole hole, int teamId, int teamSz, String equipment, String stateHole, float quantMaterial, float cost){

		locationHole = hole.getAddress();
		sizeHole = hole.getSize();
		this.teamId = teamId;
		this.teamSz = teamSz;
		this.equipment = equipment;
		this.stateHole = stateHole;
		this.quantMaterial = quantMaterial;
		this.cost = cost;

	}

	public int getTeamId(){
		return teamId;
	}

	public int getTeamSz(){
		return teamSz;
	}

	public String getEquipment(){
		return equipment;
	}

	public String getStateHole(){
		return stateHole;
	}

	public float getQuantMaterial(){
		return quantMaterial;
	}

	public float getCost(){
		return cost;
	}

}