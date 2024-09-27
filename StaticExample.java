package com.apjfsa;

class NumericData {
	// instance variable
	int num1 = 30;
	// static variable
	static int num2 = 20;

	/*----method for initializing data*/
	public void display() {
		System.out.println("First number:" + num1);
		System.out.println("Second number:" + num2);
	}

	/*---method to increment values for both the variables */
	public void increment() {
		num1 = num1 + 10;
		num2 = num2 + 20;
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// first object
		NumericData number1 = new NumericData();
		System.out.println("---first object---");
		number1.display();
		number1.increment();
		// second object
		NumericData number2 = new NumericData();
		System.out.println("---Second object---");
		number2.display();
		number2.increment();
		// third object
		NumericData number3 = new NumericData();
		System.out.println("---Third object---");
		number3.display();
		number3.increment();

		/* data without any object */
		System.out.println("Second number:" + NumericData.num2);
	}

}
