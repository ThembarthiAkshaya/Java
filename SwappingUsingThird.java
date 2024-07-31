/*program on swapping two numbers using third variable */
package com.apjfsa;

public class SwappingUsingThird {

	// creating main method
	public static void main(String[] args) {
		// initializing two variables
		int a = 10;
		int b = 20;
		int c;// temporary variable

		// logic to swap two numbers with third variable
		c = b;
		b = a;
		a = c;

		// displaying two variables after swapping
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
