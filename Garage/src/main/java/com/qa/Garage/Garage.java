package com.qa.Garage;

import java.util.ArrayList;

public class Garage {

	public static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(); 
	
	private static double bill = 0;
		
		public static void addToList(Vehicle vehicle) {
			vehicleList.add(vehicle);
		}
		
		public static void listAllVehicles() {
			vehicleList.stream().forEach(System.out::println);
			
		}

	public static void vehicleBill() {
		// This makes it go through the list, starting at bill = 0
		for (Vehicle vehicle : vehicleList) {
			bill = 0;
			
			// to change the price of different types of cars, you do '(vehicle instanceof Car)' 
			if(vehicle instanceof Car) {
				bill = bill +200;
				// the '((Car) vehicle).getBodyType()' bit is there to get the unique attributes from the sub classes (car, motorbike, bus etc)
				if (((Car) vehicle).getBodyType().equals("Hatchback")) {
					bill = bill + 50;
				}
				
			}
			if(vehicle instanceof Motorbike) {
				bill = bill + 100;
				if (vehicle.getYear()==2017) {
					bill = bill+20;
					
							
				}
			}
			if(vehicle instanceof Bus) {
				bill = bill + 300;
				if (vehicle.getColour().equals("Red")) {
					bill = bill + 10;
				}
				
			}
			System.out.println("Your vehicle: " + vehicle.getVehicleName() + "\tBill : "+ bill);
			
		}
		
			
		}
	public static void clearGarage() {
		vehicleList.clear();

		
	}
	public static void removeID(int ID) {
		vehicleList.remove(ID);
	}
	
	public static void removeType(String type) {
		vehicleList.removeIf(cars -> type.equals(cars.getClass().getSimpleName()));
	}

}
		
		

