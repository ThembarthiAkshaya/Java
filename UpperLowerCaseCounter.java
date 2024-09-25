/*--------Writing program on finding the total number of upper and lower case letters of a string-------*/
package com.apjfsa;

//Importing Scanner class 
import java.util.Scanner;

public class UpperLowerCaseCounter {

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter a string through keyboard
		System.out.println("Enter a string:");

		// Holding the entered string in a variable
		String s1 = sc.nextLine();

		// Closing the Scanner
		sc.close();

		// initializing upper case and lower case variables to zero initially
		int uppercase = 0;
		int lowercase = 0;

		// Loop through each character of the string
		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i); // Get the character at index i

			// Check if the character is upper case
			if (ch == Character.toUpperCase(ch))
				uppercase++; // Increment upper case counter
			else
				lowercase++; // Increment lower case counter
		}

		// Displaying the total number of upper and lower case characters
		System.out.println("Total number of uppercase characters:" + uppercase);
		System.out.println("Total number of lowercase characters:" + lowercase);
	}
}
