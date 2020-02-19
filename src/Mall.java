
public class Mall extends Business {

	private int numRentedUnits = 0;
	private double medianUnitSize = 0.0;
	private int numParkingSpaces = 0;
	
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;

	}
	
	public void draw() {
		System.out.println("Drawing code for Mall\n-------------------------");
	}
	
	public String displayData() {
		String str = super.displayData();
		str += "Number of Rented Units: " + numRentedUnits + "\n";
		str += "Median Unit Size: " + medianUnitSize + "\n";
		str += "Number of Parking Spaces: " + numParkingSpaces + "\n";
		return str;
	}

	@Override
	public String toString() {
		return super.toString() + "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]\n";
	}

	//GETTERS AND SETTERS
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	
	
	
}
