package com.apjfsa;

import java.util.Scanner;

public class ArrayOfEvenNum {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaration of array
		int numbers[];
		int index; // declaring a variable

		// initializing the number of elements
		numbers = new int[10];

		System.out.println("Enter array elements:");

		// Taking input through the keyboard
		for (index = 0; index < numbers.length; index++) {
			numbers[index] = sc.nextInt();
		}

		// Displaying the array elements
		for (index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index] + ",");
		}

		System.out.println("\nEven numbers in the array");

		// Displaying even numbers in the array
		for (index = 0; index < numbers.length; index++) {
			if (numbers[index] % 2 == 0)
				System.out.print(numbers[index] + ",");
		}

	}
}


