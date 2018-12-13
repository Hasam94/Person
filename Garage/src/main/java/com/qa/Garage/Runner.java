package com.qa.Garage;



public class Runner {

	public static void main(String[] args) {
		
		Vehicle veh1 = new Car("VW Golf", 2016, "Grey", "Hatchback");
		Vehicle veh2 = new Car("Audi A3", 2014, "Red", "Saloon");
		Vehicle veh3 = new Car("Mercedes", 2011, "White", "Coupe");
		Vehicle veh4 = new Bus("Divu", 2017, "Red", 36);
		Vehicle veh5 = new Motorbike("Suzuki", 2017, "Blue", true);
						
	
		Garage.addToList(veh1);
		Garage.addToList(veh2);
		Garage.addToList(veh3);
		Garage.addToList(veh4);
		Garage.addToList(veh5);
		Garage.listAllVehicles();
		
		
		Garage.vehicleBill();
//		Garage.clearGarage();
//		Garage.removeID(2);
		Garage.removeType("Bus");
		Garage.listAllVehicles();
	}
}
