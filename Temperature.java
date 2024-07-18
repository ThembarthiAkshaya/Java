/*program on converting temperature from fahrenheit to celsius */

package com.apjfsa;

import java.util.*;

public class Temperature {
	// creating main method
	public static void main(String[] args) {
		// creating an object to scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		// taking input from user
		int fahrenheit = sc.nextInt();
		int celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println(celsius + "" + "Celsius");
	}

}
