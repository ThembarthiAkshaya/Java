/*This program checks for equality between two input strings */
package com.apjfsa;

//importing scanner class for user input
import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
//creating object for scanner class to take input through the keyboard
		Scanner sc = new Scanner(System.in);
		
		//Asking the user to input the first string
		System.out.println("Enter a string:");
		
		//Storing the entered first string in a variable s1
		String s1 = sc.nextLine();
		
		//Asking the user to input the second string
		System.out.println("Enter a string:");
		
		//Storing the entered second string in a variable s2
		String s2 = sc.nextLine();
		
		//closing the scanner class
		sc.close();
		
		// Comparing the two strings for equality using the equals() method
		boolean result = s1.equals(s2);
		
		// Printing the result of the comparison
		if (result)
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are not equal");
	}

}
