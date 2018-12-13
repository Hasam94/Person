package com.qa.Garage;

public class Car extends Vehicle {

	private String bodyType;
	
	public Car(String vehicleName, int year, String colour, String bodyType) {
		super (vehicleName, year, colour);
		
		this.bodyType = bodyType;
		
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Make/Model: " + this.getVehicleName() + "\t	Model Year: " + this.getYear() + "\tColour: " + this.getColour() + "\tBody type: " + this.bodyType);
		
	}
}
