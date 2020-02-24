/**
 * The Building class is at the top of the inheritance hierarchy for this project.
 * The most general instance fields are instantiated.
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * Construction Project
 * SPRING/2020
 * 
 */
public class Building {

	protected String projectName; // the name of the project
	protected String completeAddress; // address of the unit
	protected double totalSquareFeet; // square footage of the unit
	protected String occupancyGroup; // represents occupancy group from IBC chart
	protected String subGroup; // represents subgroups from the IBC chart
	
	/**
	 * Empty-arg constructor initializes all variables to empty strings or 0
	 */
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subGroup = "";
	} // END EMPTY-ARGUMENT CONSTRUCTOR
	
	/**
	 * the preferred constructor sets fields to their respective variable from the parameters using a "this." statement.
	 * 
	 * @param projectName: the name of the unit
	 * @param completeAddress: complete address of the unit
	 * @param totalSquareFeet: represents the total square feet of the unit
	 * @param occupancyGroup: represents occupancy group from IBC chart
	 * @param subGroup: represents subgroups from the IBC chart
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	} // END PREFERRED CONSTRUCTOR

	/**
	 * draw states that the code for the building is being drawn and prints such.
	 */
	public void draw() {
		System.out.println("Drawing code for Building\n-------------------------");
	} // END DRAW
	
	/**
	 * displayData builds a String to represent the Building and its attributes
	 * 
	 * @return str: representation of the Building (String)
	 */
	public String displayData() {
		String  str = "";
		str += "Project Name: " + projectName + "\n";
		str += "Address: " + completeAddress + "\n";
		str += "Square Feet: " + totalSquareFeet + "\n";
		str += "Occupancy Group: " + occupancyGroup + "\n";
		str += "Occupancy Subgroup: " + subGroup + "\n";
		return str;
	} // END DISPLAYDATA
	

	// GETTERS AND SETTERS
	
	/**
	 * @return the name of the project
	 */
	public String getProjectName() {
		return projectName;
	} // END getProjectName

	/**
	 * @param projectName is assigned to be the name of the project
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	} // END setProjectName

	/**
	 * @return the address of the unit
	 */
	public String getCompleteAddress() {
		return completeAddress;
	} // END getCompleteAddress

	/**
	 * @param completeAddress assigns an address to the unit
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	} // END setCompleteAddress

	/**
	 * @return the total square feet of the unit
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	} // END getTotalSquareFeet

	/**
	 * @param totalSquareFeet assigns a double to be the square feet of the unit
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	} // END setTotalSquareFeet

	/**
	 * @return the occupancy group according to the IBC chart
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	} // END getOccupancyGroup

	/**
	 * @param occupancyGroup gets assigned to the occupancy group
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	} // END setOccupancyGroup

	/**
	 * @return the subgroup according to the IBC chart
	 */
	public String getSubGroup() {
		return subGroup;
	} // END getSubGroup

	/**
	 * @param subGroup gets assigned to the subgroup according to IBC
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	} // END setSubGroup
	
	/**
	 * @return a String that gives all of the basic information about the Building object
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]\n";
	} // END TOSTRING
	
} // END BUILDING
