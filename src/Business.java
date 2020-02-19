
public class Business extends Building {
	
	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits; 
	}

	public void draw() {
		System.out.println("Drawing code for Business\n-------------------------");
	}
	
	public String displayData() {
		String str = super.displayData();
		str += "Rentable Units: " + numRentableUnits + "\n";
		return str;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Business [numRentableUnits=" + numRentableUnits + "]\n";
	}

	//GETTERS AND SETTERS
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

}
