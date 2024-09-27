/*This program to combine the two input strings */
package com.apjfsa;

//importing scanner class for user input
import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		// creating object for scanner class to take input through the keyboard
		Scanner sc = new Scanner(System.in);
		
		// Asking the user to input the first string
		System.out.println("Enter a string:");
		
		// Storing the entered first string in a variable s1
		String s1 = sc.nextLine();
		
		// Asking the user to input the second string
		System.out.println("Enter a string:");
		
		// Storing the entered second string in a variable s2
		String s2 = sc.nextLine();
		
		// closing the scanner class
		sc.close();
		
		//concatenating two strings using + operator
		String s3=s1+s2;
		
		//Displaying the result of concatenation
		System.out.println("Combined String is:"+s3);
	}
}
