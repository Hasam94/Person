package com.qa.Garage;

public class Motorbike extends Vehicle {

	private Boolean wings;
	
	public Motorbike(String vehicleName, int year, String colour, boolean wings) {
		super(vehicleName, year, colour);
		
		this.wings = wings;
	}

	public Boolean getWings() {
		return wings;
	}

	public void setWings(Boolean wings) {
		this.wings = wings;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Make/Model: " + this.getVehicleName() + "\t	Model Year: " + this.getYear() + "\tColour: " + this.getColour() + "\tWings: " + this.wings);
	}
}
