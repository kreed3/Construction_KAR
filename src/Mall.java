/**
 * The Mall class inherits directly from the Business class
 * Variables: "numRentedUnits", "medianUnitSize", and "numParkingPSaces" are added
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class Mall extends Business {

	private int numRentedUnits = 0; // represents how many units of the Mall are rented
	private double medianUnitSize = 0.0; // represents the median unit size
	private int numParkingSpaces = 0; // represents # of parking spaces at the Mall
	
	/**
	 * This empty-arg constructor references the super constructor in the Business class
	 * and sets other instance fields (numRentableUnits, medianUnitSize, and numParkingSpaces) to 0
	 */
	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	} // END EMPTY-ARG CONSTRUCTOR
	
	/**
	 * The preferred constructor references the super constructor in Business
	 * and uses "this." statements to set the remaining
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subgroup: represents subgroups from the IBC chart
	 * @param numRentableUnits: represents # of units available for rent
	 * @param numRentedUnits: represents # of units already rented
	 * @param medianUnitSize: represents median size of a unit
	 * @param numParkingSpaces: represents # of parking spaces at the Mall
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	} // END PREFERED CONSTRUCTOR
	
	/**
	 * draw states that the code for the mall is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Mall\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the Mall and its attributes
	 * 
	 * @return str: representation of the Mall (String)
	 */
	public String displayData() {
		String str = super.displayData();
		str += "Number of Rented Units: " + numRentedUnits + "\n";
		str += "Median Unit Size: " + medianUnitSize + "\n";
		str += "Number of Parking Spaces: " + numParkingSpaces + "\n";
		return str;
	} // END DISPLAYDATA


	//GETTERS AND SETTERS
	/**
	 * @return the number of units rented currently
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	} // END getNumRentedUnits

	/**
	 * @param numRentedUnits gets assigned to the number of rented units
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	} // END setNumRentedUnits

	/**
	 * @return the median size of units in the mall
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	} // END getMedianUnitSize

	/**
	 * @param medianUnitSize assigns the median size
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	} // END setMedianUnitSize

	/**
	 * @return the number of parking spaces at the mall
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	} // END getNumParkingSpaces

	/**
	 * @param numParkingSpaces assigns the number of parking spaces at the mall
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	} // END setNumParkingSpaces
	
	/**
	 * @return a String that gives all of the basic information about the Mall object
	 */
	@Override
	public String toString() {
		return super.toString() + "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]\n";
	} // END toString

} // END MALL
