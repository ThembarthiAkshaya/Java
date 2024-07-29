package com.apjfsa;

import java.util.Scanner;

public class NumAverage {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// declaration of array
		int numbers[];
		
		// declaring a variable
		int index, sum;
		 float average;
		 
		 //initializing the value a variable
		sum = 0;

		// initializing the length
		numbers = new int[15];

		System.out.println("Enter any 15 numbers:");

		// Taking input through the keyboard
		for (index = 0; index < numbers.length; index++) {
			numbers[index] = sc.nextInt();
		}

		// Displaying the array elements
		for (index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index] + ",");
		}

		// finding the sum of the elements
		for (index = 0; index < numbers.length; index++) {
			sum += numbers[index];
		}
		average = sum / numbers.length;
		// displaying the average
		System.out.println("\n average=" + average);

	}

}
