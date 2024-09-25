//program on abstract class creation and usage
package com.apjfsa;

//Abstract class
abstract class Bike {
	
	// constructor
	Bike() {
		System.out.println("Bike is a two wheeler vehicle");
	}

	// abstract method
	abstract void run();
}

/*------------derived class-----------*/
class PetrolBike extends Bike {
	
	/*---------------Defining Abstract method of abstract class----------*/
	@Override
	public void run() {
		System.out.println("Petrol Bike need Petrol to run");
	}
}

//initial class
public class AbstractExample {

	public static void main(String[] args) {
		PetrolBike pulsar = new PetrolBike();
		pulsar.run();
	}
}
