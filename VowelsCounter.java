package com.apjfsa;

//Importing Scanner class
import java.util.Scanner;

public class VowelsCounter {

	public static void main(String[] args) {
		// creating object for scanner class to read user input
		Scanner sc = new Scanner(System.in);

		// asking the user to enter a sentence
		System.out.println("Enter a Sentence:");
		String sentence = sc.nextLine();

		// Closing the scanner
		sc.close();

		// Converting the sentence in lower case
		sentence = sentence.toLowerCase();

		// initializing the countVowels variable
		int countVowels = 0;

		// loop through the each character of the sentence
		for (int i = 0; i < sentence.length(); i++) {

			// Storing character at the current index in char variable 'ch'
			char ch = sentence.charAt(i);

			// checking if the character is a vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countVowels++; // Incrementing the vowel count
			}
		}

		// Displaying the total number of vowels found in the sentence
		System.out.println("Total number of vowels in the string:" + countVowels);
	}
}
