package com.qa.Garage;

public abstract class Vehicle {

	private String vehicleName;
	private int year;
	private String colour; 
			
			public Vehicle (String vehicleName, int year, String colour) {
				
				this.vehicleName = vehicleName;
				this.year = year;
				this.colour = colour;
			}
		


		public String getVehicleName() {
			return vehicleName;
		}


		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public String getColour() {
			return colour;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}
		
		
		public String toString() {
			// TODO Auto-generated method stub
			return ("Make/Model: " + this.vehicleName + "\tModel Year: " + this.year + "\tColour: " + this.colour);
		}
	
}
