/**
 * The Residential class inherits directly from the Building class
 * Variables "numBedrooms", "numBathrooms", and "laundryRoom" are added
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class Residential extends Building{

	protected int numBedrooms; // represents # of bedrooms in unit
	protected int numBathrooms; // represents # of bathrooms in unit
	protected boolean laundryRoom; // true/false for whether there's a laundry room
	
	/**
	 * This empty-arg constructor references the super constructor in the Building class
	 * and sets other instance fields to 0 (numBedrooms, numBathrooms)or false (laundryRoom)
	 */
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;	
	} // END EMPTY-ARG CONSTRUCTOR
	
	/**
	 * The preferred constructor references the super constructor
	 * and uses "this." statements to set the remaining
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subgroup: represents subgroups from the IBC chart
	 * @param numBedrooms: represents # of bedrooms in unit
	 * @param numBathrooms: represents # of bathrooms in unit
	 * @param laundryRoom: true/false for whether there's a laundry room
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	} // END PREFERED CONSTRUCTOR
	
	/**
	 * draw states that the code for the residential is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Residential\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the Residential and its attributes
	 * 
	 * @return str: representation of the Residential (String)
	 */
	public String displayData() {
		String str = super.displayData();
		str += "Number of Bedrooms: " + numBedrooms + "\n";
		str += "Number of Bathrooms: " + numBathrooms + "\n";
		if (laundryRoom == true)
			str += "Laundry Room: Y\n";
		else
			str += "Laundry Room: N\n";
		return str;
	} // END DISPLAYDATA
	
	
	//GETTERS AND SETTERS
	/**
	 * @return # of bedrooms in the unit
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	} // END getNumBedrooms

	/**
	 * @param numBedrooms assigns the # of bedrooms to numBedrooms
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	} // END setNumBedrooms

	/**
	 * @return # of bathrooms in the unit
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	} // END getNumBathrooms

	/**
	 * @param numBathrooms assigns the # of bathrooms to numBathrooms
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	} // END setNumBathrooms

	/**
	 * @return true/false whether there is a laundry room
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	} // END isLaundryRoom

	/**
	 * @param laundryRoom assigns boolean to laundryRoom
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	} // END setLaundryRoom
	
	/**
	 * @return a String that gives all of the basic information about the Residential object
	 */
	@Override
	public String toString() {
		return super.toString() + "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]\n";
	} //  END toString
	
} // END RESDIDENTIAL
