package com.apjfsa;

//Class representing a general vehicle
class Vehicle1 {
	// Fields to store the make and model of the vehicle
	String make;
	String model;

	// Parameterized constructor to initialize make and model
	Vehicle1(String make, String model) {
		this.make = make;
		this.model = model;
	}

	// Method to display details of the vehicle
	public void diplayDetails() {

		System.out.println("Make:" + make);
		System.out.println("model:" + model);
	}
}

//Subclass representing a car, which is a type of vehicle
class Car extends Vehicle1 {
	// field to store year
	int year;

	// Parameterized constructor to initialize make, model, and year
	Car(String make, String model, int year) {
		super(make, model); // Call the constructor of the base class to initialize make and model
		this.year = year; // Initialize the year field
	}

	// Method to display details of the car, including year
	public void displayDetails() {
		System.out.println("Make:" + make); // Print the make of the car
		System.out.println("model:" + model); // Print the model of the car
		System.out.println("year:" + year); // Print the year of the car
	}
}

public class InheritanceOfVehicle {

	public static void main(String[] args) {
		// creating object for Car class
		Car mycar = new Car("Toyato", "Carmy", 2020);

		// Calling the method to display details of the car
		mycar.displayDetails();
	}

}
