
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subGroup = "";
	} // END EMPTY-ARGUMENT CONSTRUCTOR
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	} // END PREFERRED CONSTRUCTOR

	public void draw() {
		System.out.println("Drawing code for Building\n-------------------------");
	} // END DRAW
	
	public String displayData() {
		String  str = "";
		str += "Project Name: " + projectName + "\n";
		str += "Address: " + completeAddress + "\n";
		str += "Square Feet: " + totalSquareFeet + "\n";
		str += "Occupancy Group: " + occupancyGroup + "\n";
		str += "Occupancy Subgroup: " + subGroup + "\n";
		return str;
	} // END DISPLAYDATA
	
	
	
	
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]\n";
	} // END TOSTRING
	
	
	

	// GETTERS AND SETTERS
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
}
