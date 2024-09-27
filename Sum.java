/*-------This program calculates the sum of ten integers entered by the user------*/
package com.apjfsa;

//importing Scanner Class for user input
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// Creating a Scanner object to take input from the keyboard
		Scanner sc = new Scanner(System.in);

		// Declaring an array to hold ten integers
		int a[];
		a = new int[10];

		// Asking the user to enter numbers
		System.out.println("Enter the numbers:");

		// Loop to read integers into the array
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt(); // Storing user input in the array
		}

		// Closing the Scanner
		sc.close();

		// Variable to hold the sum of the integers
		int sum = 0;

		// Loop to calculate the sum of the elements in the array
		for (int i = 0; i < a.length; i++) {
			sum += a[i]; // Adding each element to the sum
		}

		// Printing the total sum of the entered numbers
		System.out.println(sum);
	}

}
