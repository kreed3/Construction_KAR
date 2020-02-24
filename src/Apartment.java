/**
 * The Apartment class is a child of the Residential class
 * It specifies further variables: numRentableUnits, avgUnitSize, and parkingAvailable
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class Apartment extends Residential {

	private int numRentableUnits; // represents the number of units that can be rented
	private double avgUnitSize; // represents the average size of a unit
	private boolean parkingAvailable; // represents whether parking is available using true/false
	
	/**
	 * This empty-arg constructor references the super constructor in the Residential class
	 * and sets other instance fields to 0 or false
	 */
	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	} // END EMPTY-ARG CONSTRUCTOR
	
	/**
	 * This constructor references the super constructor in the Residential class
	 * and sets other instance fields to their respective variable from the parameters using a "this." statement.
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subgroup: represents subgroups from the IBC chart
	 * @param numBedrooms: represents # of bedrooms
	 * @param numBathrooms: represents # of bathrooms
	 * @param laundryRoom: says whether there is a laundry room or not
	 * @param numRentableUnits: represents # of units able to be rented
	 * @param avgUnitSize: represents average unit size
	 * @param parkingAvailable: says whether there is available parking
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	} // END PREFERRED CONSTRUCTOR
	
	/**
	 * draw states that the code for the Apartment is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Appartment\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the Apartment and its attributes
	 * 
	 * @return str: representation of the Apartment (String)
	 */
	public String displayData() {
		String str = super.displayData();
		str += "Number of Rentable Units: " + numRentableUnits + "\n";
		str += "Average Unit Size: " + avgUnitSize + "\n";
		if (parkingAvailable == true)
			str += "Available Parking: Y\n";
		else
			str += "Available Parking: N\n";
		return str;
	} // END DISPLAYDATA
	
	//GETTERS AND SETTERS
	/**
	 * @return the current # of rentable units
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	} // END getNumRentableUnits

	/**
	 * @param numRentableUnits sets # of rentable units
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} // END setNumRentableUnits

	/**
	 * @return the average size of a unit
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	} // END getAvgUnitSize

	/**
	 * @param avgUnitSize sets average size of this.avgUnitSize
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	} // END setAvgUnitSize

	/**
	 * @return true/false on whether parking is available
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	} // END isParkingAvailable

	/**
	 * @param parkingAvailable sets the boolean value of whether parking is available
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	} // END setParkingAvailable
	
	/**
	 * @return a String that gives all of the basic information about the Apartment
	 */
	@Override
	public String toString() {
		return super.toString() + "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]\n";
	} // END toString
	
} // END APARTMENT
