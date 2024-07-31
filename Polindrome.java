//program on polindrome
package com.apjfsa;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// creating object for scanner class
		Scanner sc = new Scanner(System.in);

		// Declaring variables
		int num, remainder;

		// initializing variable
		int reverse = 0;

		System.out.println("Enter a number");

		// Taking a number through the keyboard
		num = sc.nextInt();

		// storing the number into temporary variable
		int temp = num;

		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}

		if (temp == reverse)
			System.out.println(temp + " Polindrome");
		else
			System.out.println(temp + " Not polindrome");
	}

}
