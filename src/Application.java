
public class Application {

	public static void main(String[] args) {
		
		// BUILDING
		
		System.out.println("---------------------------------------------");
		Building A = new  Building();
		A.draw();
		System.out.println(A.toString());
		System.out.println(A.displayData());
		
		Building a = new  Building("Big Building", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1");
		a.draw();
		System.out.println(a.toString());
		System.out.println(a.displayData());
		System.out.println("---------------------------------------------");
		
		// END BUILDING
		
		
		// BUSINESS
		
		System.out.println("---------------------------------------------");
		Business B = new Business();
		B.draw();
		System.out.println(B.toString());
		System.out.println(B.displayData());
		
		Business b = new Business("New Business", "123 Main Street | Louisville, Kentucky 40201", 2540, "Business", "B", 5);
		b.draw();
		System.out.println(b.toString());
		System.out.println(b.displayData());
		System.out.println("---------------------------------------------");
		
		// END BUSINESS
		
		
		// MALL
		
		System.out.println("---------------------------------------------");
		Mall C = new Mall();
		C.draw();
		System.out.println(C.toString());
		System.out.println(C.displayData());
		
		Mall c = new Mall("Oxfoord Mall", "123 Main Street | Louisville, Kentucky 40201", 2540, "Business", "B", 5, 4, 2000.0, 300);
		c.draw();
		System.out.println(c.toString());
		System.out.println(c.displayData());
		System.out.println("---------------------------------------------");
		
		// END MALL
		
		
		// RESIDENTIAL
		
		System.out.println("---------------------------------------------");
		Residential D = new Residential();
		D.draw();
		System.out.println(D.toString());
		System.out.println(D.displayData());
		
		Residential d = new Residential("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1", 5, 4, true);
		d.draw();
		System.out.println(d.toString());
		System.out.println(d.displayData());
		System.out.println("---------------------------------------------");
	
		// END RESIDENTIAL
		
		
		// APARTMENT
		
		System.out.println("---------------------------------------------");
		Apartment E = new Apartment();
		E.draw();
		System.out.println(E.toString());
		System.out.println(E.displayData());
		
		Apartment e = new Apartment("Room 101", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1", 5, 4, true, 5, 2000.0, false);
		e.draw();
		System.out.println(e.toString());
		System.out.println(e.displayData());
		System.out.println("---------------------------------------------");
	
		// END APARTMENT
		
		
		// SINGLE FAMILY HOME
		 
		System.out.println("---------------------------------------------");
		SingleFamilyHome F = new SingleFamilyHome();
		F.draw();
		System.out.println(F.toString());
		System.out.println(F.displayData());
		
		SingleFamilyHome f = new SingleFamilyHome("A-Frame Home", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1", 5, 4, true, false);
		f.draw();
		System.out.println(f.toString());
		System.out.println(f.displayData());
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		// END SINGLE FAMILY HOME
		
		
		// TESTING GETTERS AND SETTERS
		// BUILDING CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE BUILDING CLASS\n");
		
		System.out.println("The project name currently is " + a.getProjectName());
		a.setProjectName("House Gaines");
		System.out.println("Now the project name is " + a.getProjectName() + "\n");
		
		System.out.println("The complete address currently is " + a.getCompleteAddress());
		a.setCompleteAddress("There is no address.");
		System.out.println("Now the complete address is " + a.getCompleteAddress() + "\n");

		System.out.println("The total square footage is currently " + a.getTotalSquareFeet());
		a.setTotalSquareFeet(9000.0);
		System.out.println("Now the total square footage is " + a.getTotalSquareFeet() + "\n");
		
		System.out.println("The occupancy group is currently " + a.getOccupancyGroup());
		a.setOccupancyGroup("Business");
		System.out.println("Now the occupancy group is " + a.getOccupancyGroup() + "\n");
		
		System.out.println("The subgroup is currently " + a.getSubGroup());
		a.setSubGroup("R-10");
		System.out.println("Now the subgroup is " + a.getSubGroup() + "\n");
		
		System.out.println("---------------------------------------------");
		
		// BUSINESS CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE BUSINESS CLASS\n");
		
		System.out.println("The number of rentable units is currently " + b.getNumRentableUnits());
		b.setNumRentableUnits(1000);
		System.out.println("Now the number of rentable units is " + b.getNumRentableUnits() + "\n");
		
		System.out.println("---------------------------------------------");
		
		// MALL CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE MALL CLASS\n");
		
		System.out.println("The number of rented units is currently " + c.getNumRentedUnits());
		c.setNumRentedUnits(1000);
		System.out.println("Now the number of rented units is " + c.getNumRentedUnits() + "\n");
		
		System.out.println("The median unit size is currently " + c.getMedianUnitSize());
		c.setMedianUnitSize(1000.0);
		System.out.println("Now the median unit size is " + c.getMedianUnitSize() + "\n");
		
		System.out.println("The number of parking spaces is currently " + c.getNumParkingSpaces());
		c.setNumParkingSpaces(1000);
		System.out.println("Now the number of parking spaces is " + c.getNumParkingSpaces() + "\n");
		
		System.out.println("---------------------------------------------");
		
		// RESIDENTIAL CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE RESIDENTIAL CLASS\n");
		
		System.out.println("The number of bedrooms is currently " + d.getNumBedrooms());
		d.setNumBedrooms(1000);
		System.out.println("Now the number of bedrooms is " + d.getNumBedrooms() + "\n");
		
		System.out.println("The number of bathrooms is currently " + d.getNumBathrooms());
		d.setNumBathrooms(1000);
		System.out.println("Now the number of bathrooms is " + d.getNumBathrooms() + "\n");
		
		System.out.println("It is currently " + d.isLaundryRoom() + " that there is a laundry room.");
		d.setLaundryRoom(false);
		System.out.println("Now it is " + d.isLaundryRoom() + " that there is a laundry room.\n");
		
		System.out.println("---------------------------------------------");
		
		// APARTMENT CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE APARTMENT CLASS\n");
		
		System.out.println("The number of rentable units is currently " + e.getNumRentableUnits());
		e.setNumRentableUnits(1000);
		System.out.println("Now the number of rentable units is " + e.getNumRentableUnits() + "\n");
		
		System.out.println("The average unit size is currently " + e.getAvgUnitSize());
		e.setAvgUnitSize(1000);
		System.out.println("Now the average unit size is " + e.getAvgUnitSize() + "\n");
		
		System.out.println("It is currently " + e.isParkingAvailable() + " that there is parking available.");
		e.setParkingAvailable(true);
		System.out.println("Now it is " + e.isParkingAvailable() + " that there is parking available.\n");
		
		System.out.println("---------------------------------------------");
		
		// SINGLE FAMILY HOME CLASS G AND S
		System.out.println("TESTING GETTERS AND SETTERS FOUND IN THE SINGLE FAMILY HOME CLASS\n");
		
		System.out.println("It is currently " + f.isGarage() + " that there is a garage.");
		f.setGarage(true);
		System.out.println("Now it is " + f.isGarage() + " that there is parking available.\n");
		
		System.out.println("---------------------------------------------");
	}
	
}
