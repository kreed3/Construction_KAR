
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}
	
	public void draw() {
		System.out.println("Drawing code for Single Family Home\n-------------------------");
	}
	
	public String displayData() {
		String str = super.displayData();
		if (garage == true)
			str += "Garage: Y\n";
		else
			str += "Garage: N\n";
		return str;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SingleFamilyHome [garage=" + garage + "]\n";
	}

	//GETTERS AND SETTERS
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
	
	
}
