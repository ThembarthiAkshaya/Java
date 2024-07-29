package com.apjfsa;

import java.util.*;

public class HighestOfMarks {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);
		// declaration of array
		int marks[], index;

		// initializing the length of the array
		marks = new int[20];
		System.out.println("Enter any 20 numbers:");
		// Taking input through the keyboard
		for (index = 0; index < marks.length; index++) {
			marks[index] = sc.nextInt();
		}

		// Displaying the array elements
		System.out.println("Array elements are:\n");
		for (index = 0; index < marks.length; index++) {
			System.out.print(marks[index] + ",");
		}
		// logic to get highest marks
		for (int i = 0; i < marks.length - 1; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j])
					System.out.println("\nHighest value is:" + marks[i]);
				break;
			}
		}

	}

}
