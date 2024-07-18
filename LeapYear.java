//program on leap year

package com.apjfsa;

import java.util.*;

public class LeapYear {
	// creating main method
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		// taking input from user
		int year = sc.nextInt();
		if ((year % 4 == 0) || (year % 400 == 0) || (year % 100 != 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " Not leap year");
		}
	}
}
