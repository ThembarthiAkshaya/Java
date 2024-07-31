/*program on printing a pattern*/
package com.apjfsa;

public class Pattern {

	public static void main(String[] args) {
		// taking for loop for selecting number of rows
		for (int i = 1; i <= 5; i++) {

			// taking for loop for selecting number of columns
			for (int j = 1; j <= i; j++) {
				// displaying the numbers
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
