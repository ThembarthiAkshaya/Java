/*program on printing a table in the form of rows and columns*/
package com.apjfsa;

import java.util.*;

public class TableExample {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaration of a table having 3 rows and 5 columns
		int table[][];

		// initializing number of rows and columns
		table = new int[3][5];
		int row, col;
		System.out.println("Entering the elements of the table");
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 5; col++) {
				table[row][col] = sc.nextInt();
			}
		}
		System.out.println("Elements of the table");
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 5; col++) {
				System.out.print(table[row][col] + "\t");
			}
			// changing the line for next line
			System.out.println();
		}
	}

}
