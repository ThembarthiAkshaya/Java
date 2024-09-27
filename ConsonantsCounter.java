package com.apjfsa;

//Importing Scanner class
import java.util.Scanner;

public class ConsonantsCounter {

	public static void main(String[] args) {
		// creating object for scanner class to read user input
		Scanner sc = new Scanner(System.in);

		// asking the user to enter a sentence
		System.out.println("Enter a Sentence:");

		// Storing the entered sentence in sentence variable
		String sentence = sc.nextLine();

		// Closing the scanner
		sc.close();

		// Converting the sentence in lower case
		sentence = sentence.toLowerCase();

		// initializing the countConsonants variable
		int countConsonants = 0;

		// loop through the each character of the sentence
		for (int i = 0; i < sentence.length(); i++) {

			// Storing character at the current index in char variable 'ch'
			char ch = sentence.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				// checking if the character is a Consonant
				if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
					countConsonants++; // Incrementing the Consonant count
				}
			}
		}

		// Displaying the total number of vowels found in the sentence
		System.out.println("Total number of consonants in the string:" + countConsonants);
	}
}
