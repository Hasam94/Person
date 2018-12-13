package com.qa.Garage;

public class Bus extends Vehicle {

	private int seats;
	
	public Bus(String vehicleName, int year, String colour,int seats ) {
		super(vehicleName, year, colour);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Make/Model: " + this.getVehicleName() + "\t	Model Year: " + this.getYear() + "\tColour: " + this.getColour() + "\tSeats: " + this.seats);
	}
	
}
