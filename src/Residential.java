
public class Residential extends Building{

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;	
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}
	
	public void draw() {
		System.out.println("Drawing code for Residential\n-------------------------");
	}
	
	public String displayData() {
		String str = super.displayData();
		str += "Number of Bedrooms: " + numBedrooms + "\n";
		str += "Number of Bathrooms: " + numBathrooms + "\n";
		if (laundryRoom == true)
			str += "Laundry Room: Y\n";
		else
			str += "Laundry Room: N\n";
		return str;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]\n";
	}

	//GETTERS AND SETTERS
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	
	
	
	
}
