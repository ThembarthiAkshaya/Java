/*program on swapping two numbers without third variable */
package com.apjfsa;

public class SwappingWithoutThird {
	// creating main method
	public static void main(String args[]) {
		// initializing two variables two swap
		int a = 10;
		int b = 20;

		// logic to swap two numbers
		a = a + b;// 30
		b = a - b;// 10
		a = a - b;// (30-20)10

		// displaying two variables after swapping
		System.out.println(a);
		System.out.println(b);
	}
}
