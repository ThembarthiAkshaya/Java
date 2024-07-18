/*program on finding greatest of five numbers*/
package com.apjfsa;

import java.util.*;

public class GreatestOfFive {
	// creating main method
	public static void main(String[] args) {
		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five numers:");
		// taking input from the user
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		// comparing logic for five entered numbers
		if ((a > b) && (a > c) && (a > d) && (a > e)) {
			System.out.println(a + " is greater");
		} else if ((b > c) && (b > d) && (b > e)) {
			System.out.println(b + " is greater");
		} else if ((c > d) && (c > e)) {
			System.out.println(c + " is greater");
		} else if (d > e) {
			System.out.println(d + " is greater");
		} else {
			System.out.println(e + " is greater");
		}
	}

}
