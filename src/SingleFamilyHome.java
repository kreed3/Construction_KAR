/**
 * The SingleFamilyHome class inherits directly from the Residential class
 * Variable boolean "garage" is added
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class SingleFamilyHome extends Residential {

	private boolean garage; // true/false stating whether there is a garage
	
	/**
	 * Empty-arg constructor references the super constructor from Residential
	 * and initializes garage to false
	 */
	public SingleFamilyHome() {
		super();
		garage = false;
	} // END EMPTY-ARG CONSTRUCTOR
	
	/**
	 * The preferred constructor references the super constructor in Residential
	 * and uses "this." statements to set the remaining (garage)
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subgroup: represents subgroups from the IBC chart
	 * @param numBedrooms: represents the number of bedrooms in the home
	 * @param numBathrooms: represents the number of bathrooms in the home
	 * @param laundryRoom: true/false stating whether this is a laundry room
	 * @param garage: true/false stating whether there is a garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	} // END PREFERED CONSTRUCTOR
	
	/**
	 * draw states that the code for the SingleFamilyHome is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Single Family Home\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the SingleFamilyHome and its attributes
	 * 
	 * @return str: representation of the SingleFamilyHome (String)
	 */
	public String displayData() {
		String str = super.displayData();
		if (garage == true)
			str += "Garage: Y\n";
		else
			str += "Garage: N\n";
		return str;
	} // END DISPLAYDATA
	

	//GETTERS AND SETTERS
	/**
	 * @return true/false whether there is a garage or not
	 */
	public boolean isGarage() {
		return garage;
	} // END isGarage

	/**
	 * @param garage boolean assigned to garage if there is one or not
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	} // END setGarage
	
	/**
	 * @return a String that gives all of the basic information about the SingleFamilyHome object
	 */
	@Override
	public String toString() {
		return super.toString() + "SingleFamilyHome [garage=" + garage + "]\n";
	} // END toString
	
} // END SINGLEFAMILYHOME
