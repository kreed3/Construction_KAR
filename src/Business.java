/**
 * The Business class inherits directly from the Building class
 * Variable "numRentableUnits" is added
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class Business extends Building {
	
	protected int numRentableUnits; // represents the amount of units available for rent
	
	/**
	 * This empty-arg constructor references the super constructor in the Building class
	 * and sets other instance fields (numRentableUnits) to 0
	 */
	public Business() {
		super();
		numRentableUnits = 0;
	} // END EMPTY-ARG CONSTRUCTOR
	
	/**
	 * The preferred constructor references the super constructor
	 * and uses a "this." statement to set the remaining
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subgroup: represents subgroups from the IBC chart
	 * @param numRentableUnits: represents # of units available for rent
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits; 
	} // END PREFERED CONSTRUCTOR

	/**
	 * draw states that the code for the business is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Business\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the Business and its attributes
	 * 
	 * @return str: representation of the Business (String)
	 */
	public String displayData() {
		String str = super.displayData();
		str += "Rentable Units: " + numRentableUnits + "\n";
		return str;
	} // END DISPLAYDATA
	
	
	//GETTERS AND SETTERS
	/**
	 * @return the number of units available for rent
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	} // END getNumRentableUnits

	/**
	 * @param numRentableUnits assigns this number to numRentableUnits using "this."
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	} // END setNumRentableUnits
	
	/**
	 * @return a String that gives all of the basic information about the Business object
	 */
	@Override
	public String toString() {
		return super.toString() + "Business [numRentableUnits=" + numRentableUnits + "]\n";
	} // END toString
	
} // END BUSINESS
