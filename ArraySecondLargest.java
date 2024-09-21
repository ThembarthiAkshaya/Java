//program on finding second largest number in an array
package com.apjfsa;

import java.util.Scanner;

public class ArraySecondLargest {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// declaring a variable to store the length of the numbers array
		int size;

		// Initialize an array to hold integer numbers
		int[] num;

		System.out.println("Enter the length of the array:");
		size = sc.nextInt();

		num = new int[size];

		// Asking the user to enter the array elements
		System.out.println("Enter the array elements:");

		// Loop to read 5 integer values from the user
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt(); // Store each input in the array

		}

		// Display the entered array elements
		System.out.println("Array elements are:");
		for (int i = 0; i < size; i++) {
			System.out.println(num[i] + "\t"); // Print each element with a tab space
		}

		// Initialize the variable to store the largest element
		int large = num[0]; // Assume the first element is the largest

		// Loop to find the largest element in the array
		for (int i = 1; i < num.length; i++) {

			if (num[i] > large) {
				large = num[i];
			}
		}
		// System.out.println("Largest element is:" + large);

		// Variable to store the second largest element, initially set to the first
		// element
		int secondlargest = num[0];

		// Loop to find the second largest element
		for (int i = 0; i < num.length; i++) {

			// Check if the current element is not the largest and is greater than the
			// current second largest
			if (num[i] != large && num[i] > secondlargest)
				secondlargest = num[i];
		}

		// Displaying the second largest element
		System.out.println("Second Largest element is:" + secondlargest);

		// closing scanner
		sc.close();
	}

}
