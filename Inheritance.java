/*------Writing program on inheritance------- */
package com.apjfsa;

//parent class
class Car1 {

	// Method in parent class
	public void start() {
		System.out.println("car is starting");
	}

	// method in parent class
	public void stop() {
		System.out.println("car is stoping");
	}

//method in color
	public void color() {
		System.out.println("Every car has a color");
	}

	public void headlight() {
		System.out.println("Every car has headlights");
	}
}

//derived class
//Here Mahindra acquiring the features of car class
class Mahindra extends Car1 {

	// method in derived class
	public void brand() {
		System.out.println("This car is a mahindra model");
	}

	// method in the derived class
	public void fueltype() {
		System.out.println("Mahindra car runs on diesel");
	}

}

//initial class to test the inheritance
public class Inheritance {

	public static void main(String[] args) {
		// Creating an object of the derived class
		Mahindra mahindra = new Mahindra();

		// Calling methods from the superclass using the derived class object

		mahindra.start(); // it calls the start method in parent class
		mahindra.stop(); // it calls the stop method in parent class
		mahindra.color(); // it calls the color method in parent class
		mahindra.headlight(); // it calls the headlight method in parent class
	}

}
