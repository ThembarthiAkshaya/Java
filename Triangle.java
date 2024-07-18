/*program to check whether the angles form a triangle or not*/

package com.apjfsa;

import java.util.*;

public class Triangle {
	// creating main method
	public static void main(String args[]) {
		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three angles:");

		// taking input from user
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a + b + c) == 180)
			System.out.println("Entered angles can form a triangle");
		else
			System.out.println("Entered angles cannot form a triangle");
	}
}
