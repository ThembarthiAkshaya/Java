//Program to print the total number of special characters of a string
package com.apjfsa;

//Importing the Scanner Class
import java.util.Scanner;

public class CountingSpecialCharacters {

	public static void main(String[] args) {

		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter the sentence through the keyboard
		System.out.println("Enter a sentence:");

		// storing the entered sentence in a variable
		String sentence = sc.nextLine();

		// Closing the scanner
		sc.close();

		// initializing the countVowels variable
		int countSpecialCharacters = 0;

		// loop through the each character of the sentence
		for (int i = 0; i < sentence.length(); i++) {

			// Storing character at the current index in char variable 'ch'
			char ch = sentence.charAt(i);

			// Checking the character for not being a
			// letter,digit or space
			if (!Character.isDigit(ch) && !Character.isLetter(ch)
					&& !Character.isWhitespace(ch)) {

				// Incrementing the counter for special
				// characters by one
				countSpecialCharacters++;
			}
		}

		// Displaying the Total number of special characters in the sentence
		System.out.println("Total number of special characters in the sentence are:" + countSpecialCharacters);
	}
}
